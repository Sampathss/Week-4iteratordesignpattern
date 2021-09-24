public class DoorKnobTypes implements DoorKnobTypesInterface {
     
    private DoorKnob []doorKnobs = new DoorKnob[5];
    private int index;
     
    @Override
	public void addDoorKnob(String name){
        int i = index++;
        doorKnobs[i] = new DoorKnob(i,name);
    }
     
    @Override
	public DoorKnob[] getDoorKnobs(){
        return doorKnobs;
    }
}