package facade;

public class HardDrive {
    public byte[] read(long position, int size) {
        System.out.println("Reading " + size + " bytes from hard drive at position " + position + "...");
        return new byte[size];
    }
}
