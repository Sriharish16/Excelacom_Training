package java8_lambda;

import java.util.*;
import java.util.function.*;

public interface Converter <T,R>{
	
	public R convert(T value);
	
	
	
	

}
