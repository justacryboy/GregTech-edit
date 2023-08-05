package gregtech.api.unification.material.materials;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;

public class EditMaterials {

    public static void register() {

        PTMetallicPowder = new Material.Builder(1517, gregtechId("platinum_metallic_powder"))
                .dust().ore(2, 1).color(0xFFFFC8).iconSet(METALLIC).build();

		PDMetallicPowder = new Material.Builder(1518, gregtechId("palladium_metallic_powder"))
                .dust().ore(4, 1).color(0x808080).iconSet(METALLIC).build();
    }
}
