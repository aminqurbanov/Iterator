import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }
    public void add(FileSystemComponent component){
        components.add(component);
    }
    @Override
    public void display() {
        System.out.println("\nFolder: " + name);
        System.out.println("---------------------");

        for (FileSystemComponent component : components) {
            component.display();
        }
    }

    public Iterator<FileSystemComponent> createIterator() {
        return new CompositeIterator(components.iterator());
    }
}

