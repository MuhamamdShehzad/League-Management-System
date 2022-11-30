package LogicLayer;

import java.util.ArrayList;

public class CommentaryPanel 
{
	private ArrayList<Commentator> Commentators;

	public CommentaryPanel(ArrayList<Commentator> commentators) {
		super();
		Commentators = commentators;
	}

	public ArrayList<Commentator> getCommentators() {
		return Commentators;
	}

	public void setCommentators(ArrayList<Commentator> commentators) {
		Commentators = commentators;
	}
	
}
