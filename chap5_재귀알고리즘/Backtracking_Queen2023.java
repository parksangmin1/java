package chap5_재귀알고리즘;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;



//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/?ref=lbp
//N Queen problem / backtracking

//모든 해가 나오는 버젼 만들기 
/*
* 체스판은 8 x 8
* 체스의 기물: king/가로세로대각선 1칸만 이동, queen/가로세로 대각선/같은 편의 기물을 넘을 수 없다,
*  Rook/가로,세로 이동/다른 기물을 넘을 수없다, bishop/대각선, knight/1-2칸 이동/다른 기물을 넘을 수 있다,
*  pawn/처음 이동은 2칸까지 가능, 그 후 한칸만 가능, 잡을 때는 대각선 가능
*  체스판 최대 배치 문제 : king/16, Queen/8, rook/8, bishop/?, knight/?
*  rook 2개/a, h, knight 2개/b, g, bishop 2개/c, f, queen 1개/black queen은 black 칸에, 폰 8개
*/
class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
class Stack3 {
	private Point[][] stk;
	private int capa;
	private int ptr;
	public Stack3(int max) {
		ptr = 0;
		this.capa = max;
		try {
			stk = new Point[capa][capa];
		} catch (Exception e) {
			capa=0;
		}
	}
	public void push(Point p)throws StackOverflowError {		
		if(ptr >= capa)
			throw new StackOverflowError();
		int row = ptr /capa;
		int col = ptr % capa;
		stk[row][col] = p;
		ptr++;
	}
	public Point pop() throws EmptyStackException{
		if (ptr <= 0)
			throw new EmptyStackException();
		ptr--;
		int row = ptr / capa;
		int col = ptr % capa;
		return stk[ptr][ptr];
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return ptr <= 0;
	}

	
	
	
}


public class Backtracking_Queen2023 {
	public static void solveQueen(int[][] d) throws IllegalAccessException {
		int count = 0;//퀸 배치 갯수
		int ix = 0, iy = 0;// 행 ix, 열 iy
		Stack3 st = new Stack3(100); //100개를 저장할 수 있는 스택을 만들고
		Point p = new Point(ix, iy);//현 위치를 객체로 만들고
		d[ix][iy] = 1;//현 위치에 queen을 넣었다는 표시를 하고
		count++;
		st.push(p);// 스택에 현 위치 객체를 push
		ix++;//ix는 행별로 퀸 배치되는 것을 말한다.
		while (!st.isEmpty()) {
			//pop을 한 후에 현재 위치를 pop 객체를 이용하여 설정한 진행
			if (st.isEmpty() && ix == 8) { //ix가 8이면 8개 배치 완료, stack이 empty가 아니면 다른 해를 구한다 
				showQueens(d);
				break;
			}
			if ((iy = nextMove(d, ix, iy))== -1) {//다음 이동할 열을 iy로 주는데 -1이면 더이상 이동할 열이 없음을 나타냄
				Point prevPoint = st.pop();
				d[prevPoint.getX()][prevPoint.getY()] = 0;
				count--;
				ix--;
			} else {
				Point nextPoint = new Point(ix, iy);
				st.push(nextPoint);
				d[ix][iy] =1;
				count++;
				ix++;
			}
			
			if (count == 8) { //8개를 모두 배치하면
				Point prevPoint = st.pop();
				d[prevPoint.getX()][prevPoint.getY()] = 0;
				count--;
				ix--;
			}	

		}

	}

	public static boolean checkRow(int[][] d, int crow) { //배열 d에서 행 crow에 퀸을 배치할 수 있는지 조사
		int i, j;
		for ( i = 0; i <d.length; i++)
			if(d[crow][i] == 1)
				return false;
		return true;
		
	}

	public static boolean checkCol(int[][] d, int ccol) {//배열 d에서 열 ccol에 퀸을 배치할 수 있는지 조사
		int i, j;
		for ( i = 0; i <d.length; i++)
			if(d[i][ccol] == 1)
				return false;
		return true;
	}
//	//배열 d에서 행 cx, 열 cy에 퀸을 남서, 북동 대각선으로 배치할 수 있는지 조사
	public static boolean checkDiagSW(int[][] d, int cx, int cy) throws IllegalAccessException { // x++, y-- or x--, y++ where 0<= x,y <= 7
		int size = d.length;
		int i = cx, j = cy;
		while (i >= 0 && i< size && j >= 0 && j < size)
		{
			if (d[i][j] == 1) return false;
			i++;j--;
		}
		i = cx;
		j = cy;
		while (i >= 0 && i< size && j >= 0 && j < size)
		{
			if (d[i][j] == 1) return false;
			i--;j++;
		}
//		i = cx, j = cy;
//		while (0<= (i ,j)= < size)
//		{
//			if (d[i][j] == 1) return false;
//			i--;j++;
//		}
//		
//		if (cx < 0 || cx >= size || cy <0 || cy >= size) {
//			throw new IllegalAccessException("잘못된 좌표");
//		}
//		for (int i = cx, j = cy; i < size && j >=0; i++, j--) {
//			if (d[i][j] == 1) {
//				return false;
//			}
//		}
		return true;
	}

	//배열 d에서 행 cx, 열 cy에 퀸을 남동, 북서 대각선으로 배치할 수 있는지 조사
	public static boolean checkDiagSE(int[][] d, int cx, int cy) throws IllegalAccessException {// x++, y++ or x--, y--
		int size = d.length;
		int i = cx, j = cy;
		while (i >= 0 && i< size && j >= 0 && j < size)
		{
			if (d[i][j] == 1) return false;
			i++;j++;
		}
		i = cx;
		j = cy;
		while (i >= 0 && i< size && j >= 0 && j < size)
		{
			if (d[i][j] == 1) return false;
			i--;j--;
		}
		return true;
	}
	
//	//배열 d에서 (x,y)에 퀸을 배치할 수 있는지  조사
	public static boolean checkMove(int[][] d, int x, int y) throws IllegalAccessException {// (x,y)로 이동 가능한지를 check
		int size = d.length;
		if (x < 0 || x >= size || y < 0 || y >= size) {
			throw new IllegalAccessException("잘못된 좌표");
		}
		boolean isValidMove = checkRow(d, x) && checkCol(d,y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y);
		
		return isValidMove;
	}
//	//배열 d에서 현재 위치(row,col)에 대하여 다음에 이동할 위치 nextCol을 반환, 이동이 가능하지 않으면 -1를 리턴
	public static int nextMove(int[][] d, int row, int col) throws IllegalAccessException {// 현재 row, col에 대하여 이동할 col을 return
		int size = d.length;
		
		for (int i = 0; i < size; i ++) {
			if(checkMove(d, i, col)) {
				return i;
			}
		}
		return -1;
	}
	
	

	static void showQueens(int[][] data) {//배열 출력
		for(int i = 0; i < data.length; i++) {	
			for(int j = 0; j< data.length; j++) {										
				if(data[i][j] == 1) 
					System.out.print("Q");
				else 
					System.out.print(".");
													
			}						
		}
		System.out.println("===========================");
	}
	
	public static void main(String[] args) throws IllegalAccessException {
		int row = 8, col = 8;
		int[][] data = new int[8][8];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;
				
		solveQueen(data);
//		showQueens(data);
		
	}
}
