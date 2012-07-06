package com.dnr.medical.office.data;

import com.dnr.kernel.data.Value;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: RendezVous
 *
 */
@Entity

public class RendezVous extends Value implements Serializable {

	
	private int id;
	private Date date;
	private static final long serialVersionUID = 1L;

	public RendezVous() {
		super();
	} 
	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
   
}
