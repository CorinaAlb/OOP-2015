package javasmmr.zoosome.models.animals;

public class Tiger extends Mammal {
	public Tiger() {
		this(4, "Tiger", 37.0F, 97.0F);
	}

	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float pereBodyHair) {
		super(nrOfLegs, name, normalBodyTemp, pereBodyHair);
	}
}
