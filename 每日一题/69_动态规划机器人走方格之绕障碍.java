

public int countWays(int[][] map, int x, int y) {
		int step[][]=new int[x][y];
		if(map[0][0]==0) step[0][0]=1;
		else step[0][0]=0;
		for(int j=1;j<y;j++){
			if(map[0][j]==0)
				step[0][j]=step[0][j-1];
			else
				step[0][j]=0;
		}
		for(int i=1;i<x;i++){
			if(map[i][0]==0)
				step[i][0]=step[i-1][0];
			else
				step[i][0]=0;
		}
		for(int i=1;i<x;i++){
			for(int j=1;j<y;j++){
				if(map[i][j]==0)
					step[i][j]=step[i][j-1]+step[i-1][j];
				else
					step[i][j]=0;
			}
		}
		return step[x-1][y-1];
	}
