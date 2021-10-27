

class kingCobra extends snake {
	private int currPoints;
    private int position;


    public kingCobra() {}
    
    public void setpos(int inpos) {
        position = inpos;
    }

    public void setpts(int inp){
        currPoints = inp;
    }

    public int addpos() {
        position = position - 8;
        return position;
    }

    public int addpts(){
        currPoints = currPoints - 4;
        return currPoints;
    }
}
