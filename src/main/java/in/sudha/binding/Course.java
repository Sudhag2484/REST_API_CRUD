package in.sudha.binding;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="COURSE_DTLS")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "COURSE_ID")
	private Integer cid;
	private String name;
	private Double price;
}
