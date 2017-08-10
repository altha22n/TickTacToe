
public class TTTView 
{
	//The board object from the game
	private int[][] board;
	/**
	 * constructor initializes the board array
	 * @param board
	 */
	public TTTView(int[][] board){
		this.board = board;
	}
	
	/**
	 * Print the board to the console
	 */
	public void printBoard(){
		//loop through board and add appropriate character based on board contents
		// for each board column
		//took the board sice from the tttmodel class and changed it to static
		for (int i=0; i < TTTModel.BOARD_SIZE; i++) {
			//board[i] = System.out.println('|');
			//for each board row
			for ( int j=0; j < TTTModel.BOARD_SIZE; j++){
				//print the sticks to seperate the numbers
				System.out.print ('|');
				//If our player is the first player, print X
				if ( TTTModel.X_VALUE == board[j][i]){
					System.out.print ( "X");
				}
				//if our player is the second player, print O
				else if (TTTModel.O_VALUE == board[j][i]){
					System.out.print ("O");
				}
				//else print space
				else {
					System.out.print (" ");
				}

			}
			//print the grid with the help of these characters
			System.out.print ("\n");
			System.out.println( "-------");




				//check if the board is occupied by player X, or player O, or neither
				//Print the correct character to the screen depending on the contents of the square
				//System.out.print("stuff") will print things on the same row

			//System.out.print("/n") or System.out.println() will print a new line
			//Don't forget to add in the grid lines!

		}
	}
	//method for help instructions
	public static void helpInstructions(){
	//print instructions
	System.out.println("Welcome to Tic Tac Toe! \nThe cells in the grid correspond to numbers 1-9 in order.");
	System.out.println(" 1|2|3 \n ----- \n 4|5|6 \n ----- \n 7|8|9");
	System.out.println("First player is player X, and second player is player 0.");
	System.out.println("First player prints X and seconf player prints O.");
	System.out.println("Depending on what number you input, your X or O will be located.");
	System.out.println("If you manage to have all your X or 0 in one line either vertically or horizontally,");
	System.out.println("You win! \nHave fun!");

	}
}

