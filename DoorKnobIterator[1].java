import java.util.Iterator;
 
public class DoorKnobIterator implements Iterator<DoorKnob>, DoorKnobIteratorinterface{
 
    private DoorKnob [] doorKnobs;
    int pos;
     
    public DoorKnobIterator(DoorKnob []doorKnobs){
        this.doorKnobs = doorKnobs;
    }
    @Override
    public boolean hasNext() {
        if(pos >= doorKnobs.length || doorKnobs[pos] == null)
            return false;
        return true;
    }
 
    @Override
    public DoorKnob next() {
        return doorKnobs[pos++];
    }
 
    @Override
    public void remove() {
        if(pos <=0 )
            throw new IllegalStateException("Illegal position");
        if(doorKnobs[pos-1] !=null){
            for (int i= pos-1; i<(doorKnobs.length-1);i++){
            	doorKnobs[i] = doorKnobs[i+1];
            }
            doorKnobs[doorKnobs.length-1] = null;
        }
    }
}