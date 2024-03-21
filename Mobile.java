import java.util.*;
public class Mobile implements Comparable{

	
	    String module;
		String colour1;
		public String getModule() {
			return module;
		}
		public void setModule(String module) {
			this.module = module;
		}
		public String getColour1() {
			return colour1;
		}
		public void setColour1(String colour1) {
			this.colour1 = colour1;
		}
		public Mobile(String module, String colour1) {
			super();
			this.module = module;
			this.colour1 = colour1;
		}
		@Override
		public int compareTo(Object o) {
			
			Mobile otherMobile = (Mobile)o;
			return this.module.compareTo(otherMobile.module);
		}
		@Override
		public String toString() {
			return "[module : " + module + ", colour1 : " + colour1 + "]";
			
		}
		



	
}
