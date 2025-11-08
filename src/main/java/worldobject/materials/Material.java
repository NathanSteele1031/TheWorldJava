package worldobject.materials;

import worldobject.materials.interfaces.IMaterial;

public class Material implements IMaterial {
    private final String materialName;
    private final int hardness;

    public Material(String materialName, int hardness) {
        this.materialName = materialName;
        this.hardness = hardness;
    }

    public String getName(){
        return this.materialName;
    }

    public int getHardness(){
        return this.hardness;
    }
}
