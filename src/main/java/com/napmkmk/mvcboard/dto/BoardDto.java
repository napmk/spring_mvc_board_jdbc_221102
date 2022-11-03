package com.napmkmk.mvcboard.dto;

import java.sql.Timestamp;

public class BoardDto {
	private int bid; //게시판 번호(기본키)
	private String bname; // 게시판 글쓴이
	private String btitle; // 게시판 글 제목
	private String bcontent; // 글내용
	private Timestamp bdate; //게시글 등록 날짜 시간
	private int bhit; // 조회수
	private int bgroup; //댓글그룹
	private int bstep; // 댓글 단계
	private int bindent; // 댓글 들여쓰기
	
	
	public BoardDto() {  // 글 하나가 들어갈곳.. 글다섯개면 이것도 다섯개 생김.
		super();
		// TODO Auto-generated constructor stub
	}


	public BoardDto(int bid, String bname, String btitle, String bcontent, Timestamp bdate, int bhit, int bgroup,
			int bstep, int bindent) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bhit = bhit;
		this.bgroup = bgroup;
		this.bstep = bstep;
		this.bindent = bindent;
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getBtitle() {
		return btitle;
	}


	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}


	public String getBcontent() {
		return bcontent;
	}


	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}


	public Timestamp getBdate() {
		return bdate;
	}


	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}


	public int getBhit() {
		return bhit;
	}


	public void setBhit(int bhit) {
		this.bhit = bhit;
	}


	public int getBgroup() {
		return bgroup;
	}


	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}


	public int getBstep() {
		return bstep;
	}


	public void setBstep(int bstep) {
		this.bstep = bstep;
	}


	public int getBindent() {
		return bindent;
	}


	public void setBindent(int bindent) {
		this.bindent = bindent;
	}
	
	
	
	
}
