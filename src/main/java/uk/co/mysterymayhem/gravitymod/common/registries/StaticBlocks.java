package uk.co.mysterymayhem.gravitymod.common.registries;

import uk.co.mysterymayhem.gravitymod.common.blocks.BlockGravityOre;
import uk.co.mysterymayhem.gravitymod.common.blocks.BlockGravityPlate;
import uk.co.mysterymayhem.gravitymod.common.blocks.BlockLiquidAntiMass;
import uk.co.mysterymayhem.gravitymod.common.blocks.BlockRestabilisedGravityDust;
import uk.co.mysterymayhem.gravitymod.common.blocks.gravitygenerator.BlockGravityGenerator;

/**
 * Created by Mysteryem on 2017-01-26.
 */
public class StaticBlocks {
    public static final BlockGravityGenerator GRAVITY_GENERATOR;
    public static final BlockLiquidAntiMass LIQUID_ANTI_MASS;
    public static final BlockRestabilisedGravityDust RESTABILISED_GRAVITY_DUST_BLOCK;
    public static final BlockGravityPlate WEAK_GRAVITY_PLATE;
    public static final BlockGravityPlate NORMAL_GRAVITY_PLATE;
    public static final BlockGravityPlate STRONG_GRAVITY_PLATE;
    public static final BlockGravityOre GRAVITY_ORE;

    static {
        if (ModBlocks.REGISTRY_SETUP_ALLOWED) {
            GRAVITY_GENERATOR = ModBlocks.gravityGenerator;
            LIQUID_ANTI_MASS = ModBlocks.liquidAntiMass;
            RESTABILISED_GRAVITY_DUST_BLOCK = ModBlocks.restabilisedGravityDust_Block;
            WEAK_GRAVITY_PLATE = ModBlocks.weakGravityPlate;
            NORMAL_GRAVITY_PLATE = ModBlocks.normalGravityPlate;
            STRONG_GRAVITY_PLATE = ModBlocks.strongGravityPlate;
            GRAVITY_ORE = ModBlocks.blockGravityOre;
        }
        else {
            throw new RuntimeException("Static block registry setup occurring too early");
        }
    }
}
