package files_splitter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileSplit {

    private static String FILE_Path;
    private static byte PART_SIZE;
 //   private byte part = (byte) (PART_SIZE * 1048576);

    public int splitFileBySizeForEachPart(String FILE_Path, byte PART_SIZE, int bytes_convertor) {

        File inputFile = new File(FILE_Path);
        FileInputStream inputStream;
        String newFileName;
        FileOutputStream filePart;
        int fileSize = (int) inputFile.length();
        //PART_SIZE = part;
        int nChunks = 0, read = 0, readLength = PART_SIZE * bytes_convertor;
        byte[] byteChunkPart;
        try {
            inputStream = new FileInputStream(inputFile);
            while (fileSize > 0) {
                if (fileSize <= PART_SIZE) {
                    readLength = fileSize;
                }
                byteChunkPart = new byte[readLength];
                read = inputStream.read(byteChunkPart, 0, readLength);
                fileSize -= read;
                assert (read == byteChunkPart.length);
                nChunks++;
                newFileName = FILE_Path + ".part"
                        + Integer.toString(nChunks - 1);
                filePart = new FileOutputStream(new File(newFileName));
                filePart.write(byteChunkPart);
                filePart.flush();
                filePart.close();
                byteChunkPart = null;
                filePart = null;
            }

            inputStream.close();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return nChunks;
    }

    public void splitFileByNumberofChunks(String FILE_Path, int Parts_Num) throws FileNotFoundException, IOException {

        // open the file
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(FILE_Path));

        // get the file length
        File f = new File(FILE_Path);
        long fileSize = f.length();
        long chunk_size = fileSize / Parts_Num;
        // loop for each full chunk
        int subfile;
        for (subfile = 1; subfile < (fileSize / chunk_size) ; subfile++) {
			// open the output file

            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(FILE_Path + "." + subfile));

            // write the right amount of bytes
            for (int currentByte = 0; currentByte < chunk_size; currentByte++) {
                // load one byte from the input file and write it to the output file
                out.write(in.read());
            }

            // close the file
            out.close();
        }

        // loop for the last chunk (which may be smaller than the chunk size)
        if (fileSize != chunk_size * (subfile - 1)) {
            // open the output file
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(FILE_Path + "." + subfile));

            // write the rest of the file
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }

            // close the file
            out.close();
        }

        // close the file
        in.close();

    }
}
