import java.util.HashMap;

public class FooEntity {

    private BarEntity relatedEntity;

    public BarEntity getRelatedEntity() {
        if (relatedEntity == null)
            relatedEntity = new BarEntity(); // Alternatively, this might be a database call
        return relatedEntity;
    }

}