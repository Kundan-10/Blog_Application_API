package kundan.blog.exeption;

import java.time.LocalDate;

public class ErrorDetails {
	
	private LocalDate timestamp;
	private String smg;
	private String desc;
	
public ErrorDetails() {
	this.timestamp=LocalDate.now();
	// TODO Auto-generated constructor stub
}


public ErrorDetails(String smg, String descString) {
	
	this.smg=smg;
	this.desc=desc;
}

}
