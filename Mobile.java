import java.util.*;
public class Mobile implements Comparable{

	
	    String module;
		String colour;
		public String getModule() {
			return module;
		}
		public void setModule(String module) {
			this.module = module;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		public Mobile(String module, String colour) {
			super();
			this.module = module;
			this.colour = colour;
		}
		@Override
		public int compareTo(Object o) {
			
			Mobile otherMobile = (Mobile)o;
			return this.module.compareTo(otherMobile.module);
		}
		@Override
		public String toString() {
			return "[module : " + module + ", colour : " + colour + "]";
			
		}
		



	
}
