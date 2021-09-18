package org.zerock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "member")
@Entity
@Table(name = "tbl_profile")
@EqualsAndHashCode(of = "fname")

public class Profile {
	
	//IDENTITY : 데이터베이스에 위임(MYSQL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long fno;
	
	private String fname;
	
	private boolean current;
	
	@ManyToOne
	private Member member;

}
