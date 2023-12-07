package f09_object.serializable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//== StreamCorruptedException 에러 발생 해결 class
public class ObjectAppendStream extends ObjectOutputStream{

	public ObjectAppendStream(OutputStream out) throws IOException {
		super(out);
	}
	
	@Override
	protected void writeStreamHeader() throws IOException{
	}

}
