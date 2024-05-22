public class FileSystemExample {
    public static void main(String[] args) {
        // Files
        FileSystemComponent file1 = new File("Document1.txt", 120);
        FileSystemComponent file2 = new File("Photo.jpg", 300);

        // Sub-folder
        FileSystemComponent subFolder = new Folder("My Pictures");
        FileSystemComponent file3 = new File("Vacation.png", 500);
        FileSystemComponent file4 = new File("Family.jpg", 450);
        ((Folder) subFolder).add(file3);
        ((Folder) subFolder).add(file4);

        // Main folder
        FileSystemComponent mainFolder = new Folder("My Documents");
        ((Folder) mainFolder).add(file1);
        ((Folder) mainFolder).add(file2);
        ((Folder) mainFolder).add(subFolder);
        mainFolder.display();

        // Navigate folder with iterator
        Iterator<FileSystemComponent> iterator = ((Folder) mainFolder).createIterator();
        System.out.println("\nIterating through the folder:");
        while (iterator.hasNext()) {
            iterator.next().display();
        }
    }
}
