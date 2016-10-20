package TDA;

public class triangu {
	float coo[][];
	
	public triangu(float xa, float xb, float xc, float ya, float yb, float yc){
		coo = new float[3][2];
		coo[0][0]=xa;
		coo[0][1]=ya;
		coo[1][0]=xb;
		coo[1][1]=yb;
		coo[2][0]=xc;
		coo[2][1]=yc;
	}
		
	public float Area(){
		return (coo[0][0]*(coo[2][1]-coo[1][1])+coo[2][0]*(coo[1][1]-coo[0][1])+coo[1][0]*(coo[0][1]-coo[2][1]))/2;
	}
	
	public float Perimetro(){
		return Cal_lado(coo[0][0], coo[0][1], coo[2][0], coo[2][1] )+ Cal_lado(coo[2][0], coo[2][1], coo[1][0], coo[1][1]) + Cal_lado(coo[1][0], coo[1][1], coo[0][0], coo[0][1]);
	}
	
	public float Cal_lado(float x1, float y1, float x2, float y2){
		return (float) Math.sqrt( Math.pow( x1-x2, 2 ) + Math.pow( y1-y2, 2 ));
	}
        
        public float coorde(int a, int b){
            return coo[a][b];
        }
}
