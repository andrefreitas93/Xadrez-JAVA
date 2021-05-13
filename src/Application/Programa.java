package Application;
import chess.ChessMatch;
public class Programa {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        
			ChessMatch chessMatch = new ChessMatch();
			UserInterface.printBoard(chessMatch.getPieces());
	        
		}

	}


