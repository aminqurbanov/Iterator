

class CompositeIterator implements Iterator<FileSystemComponent> {
    private java.util.Iterator<FileSystemComponent> iterator;

    public CompositeIterator(java.util.Iterator<FileSystemComponent> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public FileSystemComponent next() {
        return iterator.next();
    }
}
