

class snake extends floor {
	private int currPoints;
    private int position;

	
    public snake() {}
    
    public void setpos(int inpos) {
        position = inpos;
    }

    public void setpts(int inp){
        currPoints = inp;
    }

    public int addpos() {
        position = position - 4;
        return position;
    }

    public int addpts(){
        currPoints = currPoints - 2;
        return currPoints;
    }
}
