 
public class DoorKnobIteratorPattern {
 
    public static void main(String[] args) {
        DoorKnobTypesInterface types= new DoorKnobTypes();
        types.addDoorKnob("keyed entrance");
        types.addDoorKnob("privacy");
        types.addDoorKnob("passage ");
        types.addDoorKnob("dummy");
         
        DoorKnobIterator iterator = new DoorKnobIterator(types.getDoorKnobs());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Apply removing while iterating...");
        iterator = new DoorKnobIterator(types.getDoorKnobs());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
 
}
