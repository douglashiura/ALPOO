package main.interfaceview;

public interface MatrixEightInterf {

	public void play() throws Exception;
	public String show(String aij) throws Exception;
	public void show() throws Exception;
	public void up() throws Exception;
	public void down() throws Exception;
	public void left() throws Exception;
	public void right() throws Exception;
	public void clear()throws Exception;
	public Boolean returnWin() throws Exception;
	public String getKeyChar(Integer code)throws Exception;
}
