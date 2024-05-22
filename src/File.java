public class File implements FileSystemComponent{
    private String name;
    private double size;

    public File(String name, double size){
        this.name=name;
        this.size=size;

    }
    @Override
    public void display(){
        System.out.println(name + " [" + size + " KB]");
    }

}
