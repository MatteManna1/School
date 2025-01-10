import java.io.IOException;

class PropagazioneThrow {
	void m() throws IOException {
    	throw new IOException("errore device");
  	}
  
	void n() throws IOException {
		m();
  	}
  	
  	void p() {
		try {
    		n();
		}
    	catch(Exception err) {
    		System.out.println(err.getMessage());
    	}
  	}  
  
  	public static void main(String args[]){  
    	PropagazioneThrow obj = new PropagazioneThrow();
    	obj.p();
    	System.out.println("OK ...");
  	}
} 