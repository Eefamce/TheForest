
public class Main {

	public static void main(String[] args) {

		BroadleavedTree broadleavedTree = new BroadleavedTree("Maple","ThickTrunk","MapleLeaves","ThickBranches",50);
		Conifer conifer = new Conifer("Spruce","ThinTrunk","SpruceNeedles","ThinBranches",10);
		
		Trees[] trees = {broadleavedTree,conifer};
		
		for(Trees x : trees) {
			x.grow();
			x.produceAir();
			x.leavesTouch();
			x.aging();
		}
		
	}

}
