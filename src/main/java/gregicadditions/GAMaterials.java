package gregicadditions;

import com.google.common.collect.ImmutableList;

import gregtech.api.unification.Element;
import gregtech.api.unification.material.IMaterialHandler;
import gregtech.api.unification.material.MaterialIconSet;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.type.DustMaterial;
import gregtech.api.unification.material.type.FluidMaterial;
import gregtech.api.unification.material.type.GemMaterial;
import gregtech.api.unification.material.type.IngotMaterial;
import gregtech.api.unification.material.type.Material;
import gregtech.api.unification.material.type.SolidMaterial;
import gregtech.api.unification.material.type.SolidMaterial.MatFlags;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.MaterialStack;

@IMaterialHandler.RegisterMaterialHandler
public class GAMaterials implements IMaterialHandler {

	static long EXT2_METAL = DustMaterial.MatFlags.GENERATE_PLATE | SolidMaterial.MatFlags.GENERATE_ROD | IngotMaterial.MatFlags.GENERATE_BOLT_SCREW | SolidMaterial.MatFlags.GENERATE_GEAR | IngotMaterial.MatFlags.GENERATE_FOIL | IngotMaterial.MatFlags.GENERATE_FINE_WIRE;
	public static final FluidMaterial FISH_OIL = new FluidMaterial(975, "fish_oil", 14467421, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
	public static final FluidMaterial RAW_GROWTH_MEDIUM = new FluidMaterial(940, "raw_growth_medium", 10777425, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
	public static final FluidMaterial STERILE_GROWTH_MEDIUM = new FluidMaterial(939, "sterilized_growth_medium", 11306862, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
	public static final DustMaterial MEAT = new DustMaterial(938, "meat", 12667980, MaterialIconSet.SAND, 1, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
	public static final FluidMaterial NEUTRAL_MATTER = new FluidMaterial(883, "neutral_matter", 3956968, MaterialIconSet.FLUID, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
	public static final FluidMaterial POSITIVE_MATTER = new FluidMaterial(882, "positive_matter", 11279131, MaterialIconSet.FLUID, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
	public static final IngotMaterial NEUTRONIUM = new IngotMaterial(972, "neutronium", 12829635, MaterialIconSet.METALLIC, 6, ImmutableList.of(), EXT2_METAL | IngotMaterial.MatFlags.GENERATE_RING | IngotMaterial.MatFlags.GENERATE_ROTOR | IngotMaterial.MatFlags.GENERATE_SMALL_GEAR | SolidMaterial.MatFlags.GENERATE_LONG_ROD | MatFlags.GENERATE_FRAME, Element.valueOf("Nt"), 24.0F, 12F, 655360);
	public static final GemMaterial LIGNITE_COKE = new GemMaterial(879, "lignite_coke", 0x8b6464, MaterialIconSet.LIGNITE, 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING | SolidMaterial.MatFlags.MORTAR_GRINDABLE | Material.MatFlags.FLAMMABLE | DustMaterial.MatFlags.NO_SMELTING | DustMaterial.MatFlags.NO_SMASHING);
        public static final IngotMaterial MV_SUPERCONDUCTOR_BASE = new Ingotmaterial(988, "mv_superconductor_base", 0x535353, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Cadmium, 5), new MaterialStack(Materials.Magnesium, 1), new MaterialStack(Materials.Oxygen, 6)), STD_METAL, null, 2500);
        public static final IngotMaterial HV_SUPERCONDUCTOR_BASE = new IngotMaterial(987, "hv_superconductor_base", 0x4a2400, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Titanium, 1), new MaterialStack(Materials.Barium, 9), new MaterialStack(Materials.Copper, 10), new MaterialStack(Materials.Oxygen, 20)), STD_METAL, null, 3300);
        public static final IngotMaterial EV_SUPERCONDUCTOR_BASE = new IngotMaterial(986, "ev_superconductor_base", 0x005800, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Uranium, 1), new MaterialStack(Materials.Platinum, 3)), STD_METAL, null, 4400);
        public static final IngotMaterial IV_SUPERCONDUCTOR_BASE = new IngotMaterial(985, "iv_superconductor_base", 0x300030, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Vanadium, 1), new MaterialStack(Materials.Indium, 3)), STD_METAL, null, 5200);
        public static final IngotMaterial LuV_SUPERCONDUCTOR_BASE = new IngotMaterial(984, "luv_superconductor_base", 0x7a3c00, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Indium, 4), new MaterialStack(Materials.Bronze, 8), new MaterialStack(Materials.Barium, 2), new MaterialStack(Materials.Titanium, 1), new MaterialStack(Materials.Oxygen, 14)), STD_METAL, null, 6000);
        public static final IngotMaterial ZPM_SUPERCONDUCTOR_BASE = new IngotMaterial(983, "zpm_superconductor_base", 0x111111, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Naquadah, 4), new MaterialStack(Materials.Indium, 2), new MaterialStack(Materials.Palladium, 6), new MaterialStack(Materials.Osmium, 1)), STD_METAL, null, 8100);
        public static final BasicMaterial MVSuperconductor = new BasicMaterial(982, "mv_superconductor", 0x535353, MaterialIconSet.SHINY);
        public static final HVSuperconductor = new BasicMaterial(981, "hv_superconductor", 0x4a2400, MaterialIconSet.SHINY);
        public static final EVSuperconductor = new BasicMaterial(980, "ev_superconductor", 0x005800, MaterialIconSet.SHINY);
        public static final IVSuperconductor = new BasicMaterial(979, "iv_superconductor", 0x300030, MaterialIconSet.SHINY);
        public static final LuVSuperconductor = new BasicMaterial(978, "luv_superconductor", 0x7a3c00, MaterialIconSet.SHINY);
        public static final ZPMSuperconductor = new BasicMaterial(977, "zpm_superconductor", 0x111111, MaterialIconSet.SHINY);
        public static final Enderium = new IngotMaterial(976, "enderium", 0x23524a, MaterialIconSet.METALLIC, 3, ImmutableList.of(new MaterialStack(Materials.Lead, 3), new MaterialStack(Materials.Platinum, 1), new MaterialStack(Materials.EnderPearl, 1)), EXT_METAL | Material.MatFlags.DISABLE_DECOMPOSITION, null, 8.0F, 3.0F, 1280, 4500);
        public static final AluminoSilicateWool = new DustMaterial(975, "alumino_silicate_wool", 0xbbbbbb, MaterialIconSet.SAND, 1, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
        public static final MicaPulp = new DustMaterial(974, "mica_based", 0x917445, MaterialIconSet.SAND, 1, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
        public static final Ultima = new IngotMaterial(973, "ultima", 0x443d4f, MaterialIconSet.SHINY, 3, ImmutableList.of(new MaterialStack(Materials.TinAlloy, 1), new MaterialStack(Materials.Ultimet, 1), new MaterialStack(Materials.Magnalium, 1), new MaterialStack(Materials.BlueSteel, 1), new MaterialStack(Materials.VanadiumSteel, 1), new MaterialStack(Materials.NiobiumNitride, 1), new MaterialStack(Materials.NaquadahAlloy, 1)), EXT2_METAL | Material.MatFlags.DISABLE_DECOMPOSITION, null, 9000);
        public static final IronChloride = new FluidMaterial(972, "iron_chloride", 0x060b0b, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Iron, 1), new MaterialStack(Materials.Chlorine, 3)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
        public static final QuartzSand = new DustMaterial(971, "sand", 0xd2cfbc, MaterialIconSet.SAND, 1, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
        public static final Massicot = new DustMaterial(970, "massicot", 8943149, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Lead, 1), new MaterialStack(Materials.Oxygen, 1)), 0);
        public static final AntimonyTrioxide = new DustMaterial(969, "antimony_trioxide", 8092544, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Antimony, 2), new MaterialStack(Materials.Oxygen, 3)), 0);
        public static final Zincite = new DustMaterial(968, "zincite", 8947843, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Zinc, 1), new MaterialStack(Materials.Oxygen, 1)), 0);
        public static final CobaltOxide = new DustMaterial(967, "cobalt_oxide", 3556352, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Cobalt, 1), new MaterialStack(Materials.Oxygen, 1)), 0);
        public static final ArsenicTrioxide = new DustMaterial(966, "arsenic_trioxide", 15856113, MaterialIconSet.ROUGH, 1, ImmutableList.of(new MaterialStack(Materials.Arsenic, 2), new MaterialStack(Materials.Oxygen, 3)), 0);
        public static final CupricOxide = new DustMaterial(964, "cupric_oxide", 526344, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Copper, 1), new MaterialStack(Materials.Oxygen, 1)), 0);
        public static final Ferrosilite = new DustMaterial(963, "ferrosilite", 5256470, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Iron, 1), new MaterialStack(Materials.Silicon, 1), new MaterialStack(Materials.Oxygen, 3)), 0);


	@Override
	public void onMaterialsInit() {
		LIGNITE_COKE.setBurnTime(2400);

		Materials.YttriumBariumCuprate.addFlag(IngotMaterial.MatFlags.GENERATE_FINE_WIRE);
		Materials.Manganese.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
		Materials.Naquadah.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
		Materials.NaquadahEnriched.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
		Materials.Duranium.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
		Materials.Graphene.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
		Materials.Helium.addFlag(FluidMaterial.MatFlags.GENERATE_PLASMA);
		Materials.Oxygen.addFlag(FluidMaterial.MatFlags.GENERATE_PLASMA);
		Materials.Iron.addFlag(FluidMaterial.MatFlags.GENERATE_PLASMA);
		Materials.Nickel.addFlag(FluidMaterial.MatFlags.GENERATE_PLASMA);
		Materials.GreenSapphire.addFlag(DustMaterial.MatFlags.GENERATE_PLATE);
		Materials.GreenSapphire.addFlag(GemMaterial.MatFlags.GENERATE_LENSE);
		Materials.Tritanium.addFlag(MatFlags.GENERATE_FRAME);

		Materials.Apatite.addFlag(SolidMaterial.MatFlags.GENERATE_ROD);

		Materials.Iron.addFlag(SolidMaterial.MatFlags.GENERATE_LONG_ROD);
		Materials.Bronze.addFlag(SolidMaterial.MatFlags.GENERATE_LONG_ROD);
		Materials.Steel.addFlag(SolidMaterial.MatFlags.GENERATE_LONG_ROD);
		Materials.StainlessSteel.addFlag(SolidMaterial.MatFlags.GENERATE_LONG_ROD);

		Materials.Steel.addFlag(Material.MatFlags.DISABLE_DECOMPOSITION);

		Materials.Rubber.addFlag(IngotMaterial.MatFlags.GENERATE_BOLT_SCREW);
		Materials.Apatite.addFlag(IngotMaterial.MatFlags.GENERATE_BOLT_SCREW);

		Materials.Salt.addOreByProducts(Materials.Borax);
		Materials.RockSalt.addOreByProducts(Materials.Borax);
		Materials.Lepidolite.addOreByProducts(Materials.Boron);

		OrePrefix.gemChipped.setIgnored(LIGNITE_COKE);
		OrePrefix.gemFlawed.setIgnored(LIGNITE_COKE);
		OrePrefix.gemFlawless.setIgnored(LIGNITE_COKE);
		OrePrefix.gemExquisite.setIgnored(LIGNITE_COKE);

		Materials.Magnetite.setDirectSmelting(Materials.Iron);
	}
}
