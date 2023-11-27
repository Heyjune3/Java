package generic04_extends;

/**
  Storage Interface 구현 객체
 */

public class StorageImpl<E> implements Storage<E>{

	private E[] array;
	
	@SuppressWarnings("unchecked")
	public StorageImpl(int capacity) {
		array = (E[]) new Object[capacity];
		
	}
	
	@Override
	public void add(E item, int index) {
	}

	@Override
	public E get(int index) {
		return null;
	}

}
