package project2;

public class Car1 {
	
	private String modelName;
	
	//getter
	String getModelName() {
		return modelName;
		}
	//setter
	void setModelName(String modelName) {
		this.modelName=modelName;
	}
		
	//achieve Has-A with engine
	private Engine e=new Engine(1200);
	//getter
	Engine getEngine() {
		return e;
	}
	
	// constructor
	
	Car1(){
		
	}
	
	// constructor to initialize modelname
	Car1(String modelName){
		setModelName(modelName);
	}
}
