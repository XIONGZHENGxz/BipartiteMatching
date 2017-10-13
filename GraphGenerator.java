import java.lang.Math;
import java.util.Random;

public class GraphGenerator {
	public static Graph bipartiteUniform(int l, int r, double p) {
		Graph g = new Graph(l + r);
		for(int i = 0; i < l; i++) {
			for(int j = l; j < l + r; j++) {
				Random rand = new Random();
				if(rand.nextDouble() <= p) g.addEdge(i, j);
			}
		}
		return g;
	}

	public static Graph bipartiteUnuniform(int l, int r, double p1, double p2) {
		Graph g = new Graph(l + r);
		int firstTen = (int)(0.2 *  r);
		for(int i = 0; i < l; i++) {
			for(int j = l; j < l + firstTen; j++) {
				Random rand = new Random();
				if(rand.nextDouble() <= p1) g.addEdge(i, j);
			}
			for(int j = l + firstTen; j < l + r; j++) {
				Random rand = new Random();
				if(rand.nextDouble() <= p2) g.addEdge(i, j);
			}
		}
		return g;
	}
}

	
