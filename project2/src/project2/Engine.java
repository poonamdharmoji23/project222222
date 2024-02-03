/*
 * Engine class is the dependent class for car
 */
package project2;

class Engine {
	private double hp;
	//getter
	double gethp() {
		return hp;
	}
	//setter
	void sethp(double hp) {
		this.hp=hp;
		}
	
	//constructor
	Engine(){
		
	}
	//constructor to initialize hp
	Engine(double hp){
		sethp(hp);
	}
}
