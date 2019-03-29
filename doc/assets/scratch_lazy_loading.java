public class FooEntity {

    private BarEntity relatedEntity;

    public BarEntity getRelatedEntity() {
        if (relatedEntity == null)
            relatedEntity = new BarEntity();
        return relatedEntity;
    }

}