package gregtech.common.items;

import gregtech.api.GTValues;
import gregtech.api.items.OreDictNames;
import gregtech.api.items.metaitem.ElectricStats;
import gregtech.api.items.metaitem.FluidStats;
import gregtech.api.items.metaitem.FoodStats;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.items.metaitem.stats.IItemComponent;
import gregtech.api.items.metaitem.stats.IItemContainerItemProvider;
import gregtech.api.recipes.CountableIngredient;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.api.util.RandomPotionEffect;
import gregtech.common.ConfigHolder;
import gregtech.common.items.behaviors.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;

import static gregtech.api.util.DyeUtil.getOrdictColorName;
import static gregtech.common.items.MetaItems.*;

public class MetaItem1 extends StandardMetaItem {

    public MetaItem1() {
        super();
    }

    @Override
    public void registerSubItems() {
        CREDIT_COPPER = addItem(0, "credit.copper");
        CREDIT_CUPRONICKEL = addItem(1, "credit.cupronickel").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Cupronickel, 907200L)));
        CREDIT_SILVER = addItem(2, "credit.silver");
        CREDIT_GOLD = addItem(3, "credit.gold");
        CREDIT_PLATINUM = addItem(4, "credit.platinum");
        CREDIT_OSMIUM = addItem(5, "credit.osmium");
        CREDIT_NAQUADAH = addItem(6, "credit.naquadah");
        CREDIT_DARMSTADTIUM = addItem(7, "credit.darmstadtium");

        COIN_GOLD_ANCIENT = addItem(8, "coin.gold.ancient").
            setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Gold, 907200L)));
        COIN_DOGE = addItem(9, "coin.doge")
            .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Brass, 907200L)));
        COIN_CHOCOLATE = addItem(10, "coin.chocolate")
            .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Gold, OrePrefix.foil.materialAmount)))
            .addComponents(new FoodStats(1, 0.1F, false, true, OreDictUnifier.get(OrePrefix.foil, Materials.Gold), new RandomPotionEffect(MobEffects.SPEED, 200, 1, 10)));

        SHAPE_EMPTY = addItem(11, "shape.empty");

        SHAPE_MOLDS[0] = SHAPE_MOLD_PLATE = addItem(12, "shape.mold.plate");
        SHAPE_MOLDS[1] = SHAPE_MOLD_GEAR = addItem(13, "shape.mold.gear");
        SHAPE_MOLDS[2] = SHAPE_MOLD_CREDIT = addItem(14, "shape.mold.credit");
        SHAPE_MOLDS[3] = SHAPE_MOLD_BOTTLE = addItem(15, "shape.mold.bottle");
        SHAPE_MOLDS[4] = SHAPE_MOLD_INGOT = addItem(16, "shape.mold.ingot");
        SHAPE_MOLDS[5] = SHAPE_MOLD_BALL = addItem(17, "shape.mold.ball");
        SHAPE_MOLDS[6] = SHAPE_MOLD_BLOCK = addItem(18, "shape.mold.block");
        SHAPE_MOLDS[7] = SHAPE_MOLD_NUGGET = addItem(19, "shape.mold.nugget");
        SHAPE_MOLDS[8] = SHAPE_MOLD_CYLINDER = addItem(20, "shape.mold.cylinder");
        SHAPE_MOLDS[9] = SHAPE_MOLD_ANVIL = addItem(21, "shape.mold.anvil");
        SHAPE_MOLDS[10] = SHAPE_MOLD_NAME = addItem(22, "shape.mold.name");
        SHAPE_MOLDS[11] = SHAPE_MOLD_GEAR_SMALL = addItem(23, "shape.mold.gear.small");
        SHAPE_MOLDS[12] = SHAPE_MOLD_ROTOR = addItem(24, "shape.mold.rotor");

        SHAPE_EXTRUDERS[0] = SHAPE_EXTRUDER_PLATE = addItem(25, "shape.extruder.plate");
        SHAPE_EXTRUDERS[1] = SHAPE_EXTRUDER_ROD = addItem(26, "shape.extruder.rod");
        SHAPE_EXTRUDERS[2] = SHAPE_EXTRUDER_BOLT = addItem(27, "shape.extruder.bolt");
        SHAPE_EXTRUDERS[3] = SHAPE_EXTRUDER_RING = addItem(28, "shape.extruder.ring");
        SHAPE_EXTRUDERS[4] = SHAPE_EXTRUDER_CELL = addItem(29, "shape.extruder.cell");
        SHAPE_EXTRUDERS[5] = SHAPE_EXTRUDER_INGOT = addItem(30, "shape.extruder.ingot");
        SHAPE_EXTRUDERS[6] = SHAPE_EXTRUDER_WIRE = addItem(31, "shape.extruder.wire");
        SHAPE_EXTRUDERS[7] = SHAPE_EXTRUDER_PIPE_TINY = addItem(32, "shape.extruder.pipe.tiny");
        SHAPE_EXTRUDERS[8] = SHAPE_EXTRUDER_PIPE_SMALL = addItem(33, "shape.extruder.pipe.small");
        SHAPE_EXTRUDERS[9] = SHAPE_EXTRUDER_PIPE_MEDIUM = addItem(34, "shape.extruder.pipe.medium");
        SHAPE_EXTRUDERS[10] = SHAPE_EXTRUDER_PIPE_LARGE = addItem(35, "shape.extruder.pipe.large");
        SHAPE_EXTRUDERS[11] = SHAPE_EXTRUDER_PIPE_HUGE = addItem(36, "shape.extruder.pipe.huge");
        SHAPE_EXTRUDERS[12] = SHAPE_EXTRUDER_BLOCK = addItem(37, "shape.extruder.block");
        SHAPE_EXTRUDERS[13] = SHAPE_EXTRUDER_SWORD = addItem(38, "shape.extruder.sword");
        SHAPE_EXTRUDERS[14] = SHAPE_EXTRUDER_PICKAXE = addItem(39, "shape.extruder.pickaxe");
        SHAPE_EXTRUDERS[15] = SHAPE_EXTRUDER_SHOVEL = addItem(40, "shape.extruder.shovel");
        SHAPE_EXTRUDERS[16] = SHAPE_EXTRUDER_AXE = addItem(41, "shape.extruder.axe");
        SHAPE_EXTRUDERS[17] = SHAPE_EXTRUDER_HOE = addItem(42, "shape.extruder.hoe");
        SHAPE_EXTRUDERS[18] = SHAPE_EXTRUDER_HAMMER = addItem(43, "shape.extruder.hammer");
        SHAPE_EXTRUDERS[19] = SHAPE_EXTRUDER_FILE = addItem(44, "shape.extruder.file");
        SHAPE_EXTRUDERS[20] = SHAPE_EXTRUDER_SAW = addItem(45, "shape.extruder.saw");
        SHAPE_EXTRUDERS[21] = SHAPE_EXTRUDER_GEAR = addItem(46, "shape.extruder.gear");
        SHAPE_EXTRUDERS[22] = SHAPE_EXTRUDER_BOTTLE = addItem(47, "shape.extruder.bottle");
        SHAPE_EXTRUDERS[23] = SHAPE_EXTRUDER_FOIL = addItem(48, "shape.extruder.foil");
        SHAPE_EXTRUDERS[24] = SHAPE_EXTRUDER_GEAR_SMALL = addItem(49, "shape.extruder.gear_small");
        SHAPE_EXTRUDERS[25] = SHAPE_EXTRUDER_ROD_LONG = addItem(50, "shape.extruder.rod_long");

        SPRAY_EMPTY = addItem(51, "spray.empty")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Tin, OrePrefix.plate.materialAmount * 2L), new MaterialStack(Materials.Redstone, OrePrefix.dust.materialAmount)));

        FLUID_CELL = addItem(52, "fluid_cell").addComponents(new FluidStats(1000, Integer.MIN_VALUE, Integer.MAX_VALUE, false));

        UNIVERSAL_FLUID_CELL = addItem(53, "fluid_cell.universal").addComponents(new FluidStats(1000, Integer.MIN_VALUE, Integer.MAX_VALUE, true));

        LARGE_FLUID_CELL_STEEL = addItem(54, "large_fluid_cell.steel")
                .addComponents(new FluidStats(8000, Integer.MIN_VALUE, Integer.MAX_VALUE, true))
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Steel, OrePrefix.plate.materialAmount * 4L + OrePrefix.ring.materialAmount * 8L)));

        LARGE_FLUID_CELL_ALUMINIUM = addItem(55, "large_fluid_cell.aluminium")
                .addComponents(new FluidStats(32000, Integer.MIN_VALUE, Integer.MAX_VALUE, true))
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Aluminium, OrePrefix.plate.materialAmount * 4L + OrePrefix.ring.materialAmount * 8L)));

        LARGE_FLUID_CELL_STAINLESS_STEEL = addItem(56, "large_fluid_cell.stainless_steel")
                .addComponents(new FluidStats(64000, Integer.MIN_VALUE, Integer.MAX_VALUE, true))
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.StainlessSteel, OrePrefix.plate.materialAmount * 4L + OrePrefix.ring.materialAmount * 8L)));

        LARGE_FLUID_CELL_TITANIUM = addItem(57, "large_fluid_cell.titanium")
                .addComponents(new FluidStats(128000, Integer.MIN_VALUE, Integer.MAX_VALUE, true))
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.StainlessSteel, OrePrefix.plate.materialAmount * 4L + OrePrefix.ring.materialAmount * 8L)));

        LARGE_FLUID_CELL_TUNGSTEN_STEEL = addItem(58, "large_fluid_cell.tungstensteel")
                .addComponents(new FluidStats(512000, Integer.MIN_VALUE, Integer.MAX_VALUE, true))
                .setMaxStackSize(32)
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.TungstenSteel, OrePrefix.plate.materialAmount * 4L + OrePrefix.ring.materialAmount * 8L)));

        LARGE_FLUID_CELL_CHROME = addItem(59, "large_fluid_cell.chrome")
                .addComponents(new FluidStats(2048000, Integer.MIN_VALUE, Integer.MAX_VALUE, true))
                .setMaxStackSize(32)
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Chrome, OrePrefix.plate.materialAmount * 4L + OrePrefix.ring.materialAmount * 8L)));

        LARGE_FLUID_CELL_IRIDIUM = addItem(60, "large_fluid_cell.iridium")
                .addComponents(new FluidStats(8192000, Integer.MIN_VALUE, Integer.MAX_VALUE, true))
                .setMaxStackSize(2)
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Iridium, OrePrefix.plate.materialAmount * 4L + OrePrefix.ring.materialAmount * 8L)));

        LARGE_FLUID_CELL_OSMIUM = addItem(61, "large_fluid_cell.osmium")
                .addComponents(new FluidStats(32768000, Integer.MIN_VALUE, Integer.MAX_VALUE, true))
                .setMaxStackSize(1)
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Osmium, OrePrefix.plate.materialAmount * 4L + OrePrefix.ring.materialAmount * 8L)));

        LARGE_FLUID_CELL_NEUTRONIUM = addItem(62, "large_fluid_cell.neutronium")
                .addComponents(new FluidStats(131072000, Integer.MIN_VALUE, Integer.MAX_VALUE, true))
                .setMaxStackSize(1)
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Neutronium, OrePrefix.plate.materialAmount * 4L + OrePrefix.ring.materialAmount * 8L)));

        for (int i = 0; i < EnumDyeColor.values().length; i++) {
            EnumDyeColor dyeColor = EnumDyeColor.values()[i];
            SPRAY_CAN_DYES[i] = addItem(63 + i, "spray.can.dyes." + dyeColor.getName()).setMaxStackSize(1);
            ColorSprayBehaviour behaviour = new ColorSprayBehaviour(SPRAY_EMPTY.getStackForm(), 512, i);
            SPRAY_CAN_DYES[i].addComponents(behaviour);
        }



        TOOL_MATCHES = addItem(79, "tool.matches")
                .addComponents(new LighterBehaviour(1));
        TOOL_MATCHBOX = addItem(80, "tool.matchbox")
                .addComponents(new LighterBehaviour(16)).setMaxStackSize(1);
        TOOL_LIGHTER_INVAR = addItem(81, "tool.lighter.invar")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Invar, GTValues.L * 2)))
                .addComponents(new LighterBehaviour(100)).setMaxStackSize(1);
        TOOL_LIGHTER_PLATINUM = addItem(82, "tool.lighter.platinum")
                .setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.Platinum, GTValues.L * 2)))
                .addComponents(new LighterBehaviour(1000)).setMaxStackSize(1);

        BATTERY_HULL_LV = addItem(83, "battery.hull.lv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.BatteryAlloy, OrePrefix.plate.materialAmount)));
        BATTERY_HULL_MV = addItem(84, "battery.hull.mv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.BatteryAlloy, OrePrefix.plate.materialAmount * 3L)));
        BATTERY_HULL_HV = addItem(85, "battery.hull.hv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(Materials.BatteryAlloy, OrePrefix.plate.materialAmount * 9L)));

        BATTERY_RE_ULV_TANTALUM = addItem(86, "battery.re.ulv.tantalum").addComponents(ElectricStats.createRechargeableBattery(1000, 0));

        BATTERY_SU_LV_SULFURIC_ACID = addItem(87, "battery.su.lv.sulfuricacid").addComponents(ElectricStats.createBattery(18000, 1, false)).setModelAmount(8);
        BATTERY_SU_LV_MERCURY = addItem(88, "battery.su.lv.mercury").addComponents(ElectricStats.createBattery(32000, 1, false)).setModelAmount(8);

        BATTERY_RE_LV_CADMIUM = addItem(89, "battery.re.lv.cadmium").addComponents(ElectricStats.createRechargeableBattery(120000, 1)).setModelAmount(8);
        BATTERY_RE_LV_LITHIUM = addItem(90, "battery.re.lv.lithium").addComponents(ElectricStats.createRechargeableBattery(100000, 1)).setModelAmount(8);
        BATTERY_RE_LV_SODIUM = addItem(91, "battery.re.lv.sodium").addComponents(ElectricStats.createRechargeableBattery(80000, 1)).setModelAmount(8);

        BATTERY_SU_MV_SULFURIC_ACID = addItem(92, "battery.su.mv.sulfuricacid").addComponents(ElectricStats.createBattery(72000, 2, false)).setModelAmount(8);
        BATTERY_SU_MV_MERCURY = addItem(93, "battery.su.mv.mercury").addComponents(ElectricStats.createBattery(128000, 2, false)).setModelAmount(8);

        BATTERY_RE_MV_CADMIUM = addItem(94, "battery.re.mv.cadmium").addComponents(ElectricStats.createRechargeableBattery(420000, 2)).setModelAmount(8);
        BATTERY_RE_MV_LITHIUM = addItem(95, "battery.re.mv.lithium").addComponents(ElectricStats.createRechargeableBattery(400000, 2)).setModelAmount(8);
        BATTERY_RE_MV_SODIUM = addItem(96, "battery.re.mv.sodium").addComponents(ElectricStats.createRechargeableBattery(360000, 2)).setModelAmount(8);

        BATTERY_SU_HV_SULFURIC_ACID = addItem(97, "battery.su.hv.sulfuricacid").addComponents(ElectricStats.createBattery(288000, 3, false)).setModelAmount(8);
        BATTERY_SU_HV_MERCURY = addItem(98, "battery.su.hv.mercury").addComponents(ElectricStats.createBattery(512000, 3, false)).setModelAmount(8);

        BATTERY_RE_HV_CADMIUM = addItem(99, "battery.re.hv.cadmium").addComponents(ElectricStats.createRechargeableBattery(1800000, 3)).setModelAmount(8);
        BATTERY_RE_HV_LITHIUM = addItem(100, "battery.re.hv.lithium").addComponents(ElectricStats.createRechargeableBattery(1600000, 3)).setModelAmount(8);
        BATTERY_RE_HV_SODIUM = addItem(101, "battery.re.hv.sodium").addComponents(ElectricStats.createRechargeableBattery(1200000, 3)).setModelAmount(8);

        ENERGY_LAPOTRONIC_ORB = addItem(102, "energy.lapotronicorb").addComponents(ElectricStats.createRechargeableBattery(100000000, 5)).setUnificationData(OrePrefix.battery, MarkerMaterials.Tier.Ultimate).setModelAmount(8);
        ENERGY_LAPOTRONIC_ORB2 = addItem(103, "energy.lapotronicorb2").addComponents(ElectricStats.createRechargeableBattery(1000000000, 6)).setUnificationData(OrePrefix.battery, MarkerMaterials.Tier.Ultimate).setModelAmount(8);

        ZPM = addItem(104, "zpm").addComponents(ElectricStats.createBattery(2000000000000L, GTValues.ZPM, false)).setModelAmount(8);
        ZPM2 = addItem(105, "zpm2").addComponents(ElectricStats.createRechargeableBattery(Long.MAX_VALUE, GTValues.UV)).setModelAmount(8);

        ELECTRIC_MOTOR_LV = addItem(106, "electric.motor.lv");
        ELECTRIC_MOTOR_MV = addItem(107, "electric.motor.mv");
        ELECTRIC_MOTOR_HV = addItem(108, "electric.motor.hv");
        ELECTRIC_MOTOR_EV = addItem(109, "electric.motor.ev");
        ELECTRIC_MOTOR_IV = addItem(110, "electric.motor.iv");
        ELECTRIC_MOTOR_LUV = addItem(111, "electric.motor.luv");
        ELECTRIC_MOTOR_ZPM = addItem(112, "electric.motor.zpm");
        ELECTRIC_MOTOR_UV = addItem(113, "electric.motor.uv");

        PUMPS[0] = ELECTRIC_PUMP_LV = addItem(114, "electric.pump.lv");
        PUMPS[1] = ELECTRIC_PUMP_MV = addItem(115, "electric.pump.mv");
        PUMPS[2] = ELECTRIC_PUMP_HV = addItem(116, "electric.pump.hv");
        PUMPS[3] = ELECTRIC_PUMP_EV = addItem(117, "electric.pump.ev");
        PUMPS[4] = ELECTRIC_PUMP_IV = addItem(118, "electric.pump.iv");
        PUMPS[5] = ELECTRIC_PUMP_LUV = addItem(119, "electric.pump.luv");
        PUMPS[6] = ELECTRIC_PUMP_ZPM = addItem(120, "electric.pump.zpm");
        PUMPS[7] = ELECTRIC_PUMP_UV = addItem(121, "electric.pump.uv");

        RUBBER_DROP = addItem(122, "rubber_drop").setBurnValue(200);

        FLUID_FILTER = addItem(123, "fluid_filter");

        DYNAMITE = addItem(124, "dynamite").addComponents(new DynamiteBehaviour()).setMaxStackSize(16);

        CONVEYOR_MODULE_LV = addItem(125, "conveyor.module.lv");
        CONVEYOR_MODULE_MV = addItem(126, "conveyor.module.mv");
        CONVEYOR_MODULE_HV = addItem(127, "conveyor.module.hv");
        CONVEYOR_MODULE_EV = addItem(128, "conveyor.module.ev");
        CONVEYOR_MODULE_IV = addItem(129, "conveyor.module.iv");
        CONVEYOR_MODULE_LUV = addItem(130, "conveyor.module.luv");
        CONVEYOR_MODULE_ZPM = addItem(131, "conveyor.module.zpm");
        CONVEYOR_MODULE_UV = addItem(132, "conveyor.module.uv");

        ELECTRIC_PISTON_LV = addItem(133, "electric.piston.lv");
        ELECTRIC_PISTON_MV = addItem(134, "electric.piston.mv");
        ELECTRIC_PISTON_HV = addItem(135, "electric.piston.hv");
        ELECTRIC_PISTON_EV = addItem(136, "electric.piston.ev");
        ELECTRIC_PISTON_IV = addItem(137, "electric.piston.iv");
        ELECTRIC_PISTON_LUV = addItem(138, "electric.piston.luv");
        ELECTRIC_PISTON_ZPM = addItem(139, "electric.piston.zpm");
        ELECTRIC_PISTON_UV = addItem(140, "electric.piston.uv");

        ROBOT_ARM_LV = addItem(141, "robot.arm.lv");
        ROBOT_ARM_MV = addItem(142, "robot.arm.mv");
        ROBOT_ARM_HV = addItem(143, "robot.arm.hv");
        ROBOT_ARM_EV = addItem(144, "robot.arm.ev");
        ROBOT_ARM_IV = addItem(145, "robot.arm.iv");
        ROBOT_ARM_LUV = addItem(146, "robot.arm.luv");
        ROBOT_ARM_ZPM = addItem(147, "robot.arm.zpm");
        ROBOT_ARM_UV = addItem(148, "robot.arm.uv");

        FIELD_GENERATOR_LV = addItem(149, "field.generator.lv");
        FIELD_GENERATOR_MV = addItem(150, "field.generator.mv");
        FIELD_GENERATOR_HV = addItem(151, "field.generator.hv");
        FIELD_GENERATOR_EV = addItem(152, "field.generator.ev");
        FIELD_GENERATOR_IV = addItem(153, "field.generator.iv");
        FIELD_GENERATOR_LUV = addItem(154, "field.generator.luv");
        FIELD_GENERATOR_ZPM = addItem(155, "field.generator.zpm");
        FIELD_GENERATOR_UV = addItem(156, "field.generator.uv");

        EMITTER_LV = addItem(157, "emitter.lv");
        EMITTER_MV = addItem(158, "emitter.mv");
        EMITTER_HV = addItem(159, "emitter.hv");
        EMITTER_EV = addItem(160, "emitter.ev");
        EMITTER_IV = addItem(161, "emitter.iv");
        EMITTER_LUV = addItem(162, "emitter.luv");
        EMITTER_ZPM = addItem(163, "emitter.zpm");
        EMITTER_UV = addItem(164, "emitter.uv");

        SENSOR_LV = addItem(165, "sensor.lv");
        SENSOR_MV = addItem(166, "sensor.mv");
        SENSOR_HV = addItem(167, "sensor.hv");
        SENSOR_EV = addItem(168, "sensor.ev");
        SENSOR_IV = addItem(169, "sensor.iv");
        SENSOR_LUV = addItem(170, "sensor.luv");
        SENSOR_ZPM = addItem(171, "sensor.zpm");
        SENSOR_UV = addItem(172, "sensor.uv");

        TOOL_DATA_STICK = addItem(173, "tool.datastick");
        TOOL_DATA_ORB = addItem(174, "tool.dataorb");

        COMPONENT_SAW_BLADE_DIAMOND = addItem(175, "component.sawblade.diamond").addOreDict(OreDictNames.craftingDiamondBlade);
        COMPONENT_GRINDER_DIAMOND = addItem(176, "component.grinder.diamond").addOreDict(OreDictNames.craftingGrinder);
        COMPONENT_GRINDER_TUNGSTEN = addItem(177, "component.grinder.tungsten").addOreDict(OreDictNames.craftingGrinder);

        QUANTUM_EYE = addItem(178, "quantumeye");
        QUANTUM_STAR = addItem(179, "quantumstar");
        GRAVI_STAR = addItem(180, "gravistar");

        ITEM_FILTER = addItem(181, "item_filter");
        ORE_DICTIONARY_FILTER = addItem(182, "ore_dictionary_filter");
        SMART_FILTER = addItem(183, "smart_item_filter");

        COVER_MACHINE_CONTROLLER = addItem(184, "cover.controller");

        COVER_ACTIVITY_DETECTOR = addItem(185, "cover.activity.detector").setInvisible();
        COVER_FLUID_DETECTOR = addItem(186, "cover.fluid.detector").setInvisible();
        COVER_ITEM_DETECTOR = addItem(187, "cover.item.detector").setInvisible();
        COVER_ENERGY_DETECTOR = addItem(188, "cover.energy.detector").setInvisible();

        COVER_SCREEN = addItem(189, "cover.screen").setInvisible();
        COVER_CRAFTING = addItem(190, "cover.crafting").setInvisible();
        COVER_DRAIN = addItem(191, "cover.drain").setInvisible();

        COVER_SHUTTER = addItem(192, "cover.shutter");

        COVER_SOLAR_PANEL = addItem(193, "cover.solar.panel");
        COVER_SOLAR_PANEL_ULV = addItem(194, "cover.solar.panel.ulv");
        COVER_SOLAR_PANEL_LV = addItem(195, "cover.solar.panel.lv");

        INTEGRATED_CIRCUIT = addItem(196, "circuit.integrated").addComponents(new IntCircuitBehaviour()).setModelAmount(33);
        FOAM_SPRAYER = addItem(197, "foam_sprayer").addComponents(new FoamSprayerBehavior()).setMaxStackSize(1);
        GELLED_TOLUENE = addItem(198, "gelled_toluene");

        IItemContainerItemProvider selfContainerItemProvider = itemStack -> itemStack;
        WOODEN_FORM_EMPTY = addItem(199, "wooden_form.empty");
        WOODEN_FORM_BRICK = addItem(200, "wooden_form.brick").addComponents(selfContainerItemProvider);

        COMPRESSED_CLAY = addItem(201, "compressed.clay");
        COMPRESSED_FIRECLAY = addItem(202, "compressed.fireclay");
        FIRECLAY_BRICK = addItem(203, "brick.fireclay");
        COKE_OVEN_BRICK = addItem(204, "brick.coke");

        SILICON_BOULE = addItem(205, "boule.silicon");
        GLOWSTONE_BOULE = addItem(206, "boule.glowstone");
        NAQUADAH_BOULE = addItem(207, "boule.naquadah");
        NEUTRONIUM_BOULE = addItem(208, "boule.neutronium");
        SILICON_WAFER = addItem(209, "wafer.silicon");
        GLOWSTONE_WAFER = addItem(210, "wafer.glowstone");
        NAQUADAH_WAFER = addItem(211, "wafer.naquadah");
        NEUTRONIUM_WAFER = addItem(212, "wafer.neutronium");

        COATED_BOARD = addItem(213, "board.coated");
        PHENOLIC_BOARD = addItem(214, "board.phenolic");
        PLASTIC_BOARD = addItem(215, "board.plastic");
        EPOXY_BOARD = addItem(216, "board.epoxy");
        FIBER_BOARD = addItem(217, "board.fiber_reinforced");
        MULTILAYER_FIBER_BOARD = addItem(218, "board.multilayer.fiber_reinforced");
        WETWARE_BOARD = addItem(219, "board.wetware");

        BASIC_CIRCUIT_BOARD = addItem(220, "circuit_board.basic");
        GOOD_CIRCUIT_BOARD = addItem(221, "circuit_board.good");
        PLASTIC_CIRCUIT_BOARD = addItem(222, "circuit_board.plastic");
        ADVANCED_CIRCUIT_BOARD = addItem(223, "circuit_board.advanced");
        EXTREME_CIRCUIT_BOARD = addItem(224, "circuit_board.extreme");
        ELITE_CIRCUIT_BOARD = addItem(225, "circuit_board.elite");
        WETWARE_CIRCUIT_BOARD = addItem(226, "circuit_board.wetware");

        BOTTLE_PURPLE_DRINK = addItem(227, "bottle.purple.drink").addComponents(new FoodStats(8, 0.2F, true, true, new ItemStack(Items.GLASS_BOTTLE), new RandomPotionEffect(MobEffects.HASTE, 800, 1, 90)));

        ENERGY_CRYSTAL = addItem(228, "energy_crystal").addComponents(ElectricStats.createRechargeableBattery(4000000L, GTValues.HV)).setModelAmount(8).setMaxStackSize(1);
        LAPOTRON_CRYSTAL = addItem(229, "lapotron_crystal").addComponents(ElectricStats.createRechargeableBattery(10000000L, GTValues.EV)).setModelAmount(8).setMaxStackSize(1);

        DYE_INDIGO = addItem(230, "dye.indigo").addOreDict("dyeBlue").setInvisible();
        for (int i = 0; i < EnumDyeColor.values().length; i++) {
            EnumDyeColor dyeColor = EnumDyeColor.values()[i];
            DYE_ONLY_ITEMS[i] = addItem(231 + i, "dye." + dyeColor.getName()).addOreDict(getOrdictColorName(dyeColor));
        }

        PLANT_BALL = addItem(247, "plant_ball").setBurnValue(75);
        BIO_CHAFF = addItem(248, "bio_chaff").setBurnValue(200);
        ENERGIUM_DUST = addItem(249, "energium_dust");

        POWER_UNIT_LV = addItem(250, "power_unit.lv").addComponents(ElectricStats.createElectricItem(100000L, GTValues.LV)).setMaxStackSize(8);
        POWER_UNIT_MV = addItem(251, "power_unit.mv").addComponents(ElectricStats.createElectricItem(400000L, GTValues.MV)).setMaxStackSize(8);
        POWER_UNIT_HV = addItem(252, "power_unit.hv") .addComponents(ElectricStats.createElectricItem(1600000L, GTValues.HV)).setMaxStackSize(8);
        POWER_UNIT_EV = addItem(253, "power_unit.ev") .addComponents(ElectricStats.createElectricItem(6400000L, GTValues.EV)).setMaxStackSize(8);
        POWER_UNIT_IV = addItem(254, "power_unit.iv") .addComponents(ElectricStats.createElectricItem(25600000L, GTValues.IV)).setMaxStackSize(8);


        NANO_SABER = addItem(255, "nano_saber").addComponents(ElectricStats.createElectricItem(4000000L, GTValues.HV)).addComponents(new NanoSaberBehavior()).setMaxStackSize(1);
        ENERGY_FIELD_PROJECTOR = addItem(256, "energy_field_projector").addComponents(ElectricStats.createElectricItem(16000000L, GTValues.EV)).setMaxStackSize(1);
        SCANNER = addItem(257, "scanner").addComponents(ElectricStats.createElectricItem(200_000L, GTValues.LV), new ScannerBehavior(50));


        INGOT_MIXED_METAL = addItem(258, "ingot.mixed_metal");
        ADVANCED_ALLOY_PLATE = addItem(259, "plate.advanced_alloy");
        INGOT_IRIDIUM_ALLOY = addItem(260, "ingot.iridium_alloy");
        PLATE_IRIDIUM_ALLOY = addItem(261, "plate.iridium_alloy");
        NEUTRON_REFLECTOR = addItem(262, "neutron_reflector");


        VACUUM_TUBE = addItem(263, "circuit.vacuum_tube").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Primitive);
        GLASS_TUBE = addItem(264, "component.glass.tube");
        SMALL_COIL = addItem(265, "component.small_coil");
        TRANSISTOR = addItem(266, "component.transistor").setUnificationData(OrePrefix.component, MarkerMaterials.Component.Transistor);
        RESISTOR = addItem(267, "component.resistor").setUnificationData(OrePrefix.component, MarkerMaterials.Component.Resistor);
        CAPACITOR = addItem(268, "component.capacitor").setUnificationData(OrePrefix.component, MarkerMaterials.Component.Capacitor);
        DIODE = addItem(269, "component.diode").setUnificationData(OrePrefix.component, MarkerMaterials.Component.Diode);
        SMD_TRANSISTOR = addItem(270, "component.smd.transistor").setUnificationData(OrePrefix.component, MarkerMaterials.Component.Transistor);
        SMD_RESISTOR = addItem(271, "component.smd.resistor").setUnificationData(OrePrefix.component, MarkerMaterials.Component.Resistor);
        SMD_CAPACITOR = addItem(272, "component.smd.capacitor").setUnificationData(OrePrefix.component, MarkerMaterials.Component.Capacitor);
        SMD_DIODE = addItem(273, "component.smd.diode").setUnificationData(OrePrefix.component, MarkerMaterials.Component.Diode);
        ADVANCED_SMD_TRANSISTOR = addItem(274, "component.advanced_smd.transistor");
        ADVANCED_SMD_RESISTOR = addItem(275, "component.advanced_smd.resistor");
        ADVANCED_SMD_CAPACITOR = addItem(276, "component.advanced_smd.capacitor");
        ADVANCED_SMD_DIODE = addItem(277, "component.advanced_smd.diode");

        HIGHLY_ADVANCED_SOC_WAFER = addItem(278, "wafer.highly_advanced_system_on_chip");
        ADVANCED_SYSTEM_ON_CHIP_WAFER = addItem(279, "wafer.advanced_system_on_chip");
        INTEGRATED_LOGIC_CIRCUIT_WAFER = addItem(280, "wafer.integrated_logic_circuit");
        CENTRAL_PROCESSING_UNIT_WAFER = addItem(281, "wafer.central_processing_unit");
        ULTRA_LOW_POWER_INTEGRATED_CIRCUIT_WAFER = addItem(282, "wafer.ultra_low_power_integrated_circuit");
        LOW_POWER_INTEGRATED_CIRCUIT_WAFER = addItem(283, "wafer.low_power_integrated_circuit");
        POWER_INTEGRATED_CIRCUIT_WAFER = addItem(284, "wafer.power_integrated_circuit");
        HIGH_POWER_INTEGRATED_CIRCUIT_WAFER = addItem(285, "wafer.high_power_integrated_circuit");
        NAND_MEMORY_CHIP_WAFER = addItem(286, "wafer.nand_memory_chip");
        NANO_CENTRAL_PROCESSING_UNIT_WAFER = addItem(287, "wafer.nano_central_processing_unit");
        NOR_MEMORY_CHIP_WAFER = addItem(288, "wafer.nor_memory_chip");
        QBIT_CENTRAL_PROCESSING_UNIT_WAFER = addItem(289, "wafer.qbit_central_processing_unit");
        RANDOM_ACCESS_MEMORY_WAFER = addItem(290, "wafer.random_access_memory");
        SYSTEM_ON_CHIP_WAFER = addItem(291, "wafer.system_on_chip");
        SIMPLE_SYSTEM_ON_CHIP_WAFER = addItem(292, "wafer.simple_system_on_chip");

        RAW_CRYSTAL_CHIP = addItem(293, "crystal.raw");
        RAW_CRYSTAL_CHIP_PART = addItem(294, "crystal.raw_chip");
        ENGRAVED_CRYSTAL_CHIP = addItem(295, "engraved.crystal_chip");
        ENGRAVED_LAPOTRON_CHIP = addItem(296, "engraved.lapotron_chip");
        CRYSTAL_CENTRAL_PROCESSING_UNIT = addItem(297, "crystal.central_processing_unit");
        CRYSTAL_SYSTEM_ON_CHIP = addItem(298, "crystal.system_on_chip");
        HIGHLY_ADVANCED_SOC = addItem(299, "plate.highly_advanced_system_on_chip");
        ADVANCED_SYSTEM_ON_CHIP = addItem(300, "plate.advanced_system_on_chip");
        INTEGRATED_LOGIC_CIRCUIT = addItem(301, "plate.integrated_logic_circuit");
        CENTRAL_PROCESSING_UNIT = addItem(302, "plate.central_processing_unit");
        ULTRA_LOW_POWER_INTEGRATED_CIRCUIT = addItem(303, "plate.ultra_low_power_integrated_circuit");
        LOW_POWER_INTEGRATED_CIRCUIT = addItem(304, "plate.low_power_integrated_circuit");
        POWER_INTEGRATED_CIRCUIT = addItem(305, "plate.power_integrated_circuit");
        HIGH_POWER_INTEGRATED_CIRCUIT = addItem(306, "plate.high_power_integrated_circuit");
        NAND_MEMORY_CHIP = addItem(307, "plate.nand_memory_chip");
        NANO_CENTRAL_PROCESSING_UNIT = addItem(308, "plate.nano_central_processing_unit");
        NOR_MEMORY_CHIP = addItem(309, "plate.nor_memory_chip");
        QBIT_CENTRAL_PROCESSING_UNIT = addItem(310, "plate.qbit_central_processing_unit");
        RANDOM_ACCESS_MEMORY = addItem(311, "plate.random_access_memory");
        SYSTEM_ON_CHIP = addItem(312, "plate.system_on_chip");
        SIMPLE_SYSTEM_ON_CHIP = addItem(313, "plate.simple_system_on_chip");


        // CIRCUITS

        // T1: Electronic
        ELECTRONIC_CIRCUIT_LV = addItem(314, "circuit.electronic").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Basic);
        ELECTRONIC_CIRCUIT_MV = addItem(315, "circuit.good_electronic").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Good);

        // T2: Integrated
        INTEGRATED_CIRCUIT_LV = addItem(316, "circuit.basic_integrated").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Basic);
        INTEGRATED_CIRCUIT_MV = addItem(317, "circuit.good_integrated").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Good);
        INTEGRATED_CIRCUIT_HV = addItem(318, "circuit.advanced_integrated").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Advanced);

        // Misc Unlocks
        NAND_CHIP_ULV = addItem(319, "circuit.nand_chip").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Primitive);
        MICROPROCESSOR_LV = addItem(320, "circuit.microprocessor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Basic);

        // T3: Processor
        PROCESSOR_MV = addItem(321, "circuit.processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Good);
        PROCESSOR_ASSEMBLY_HV = addItem(322, "circuit.assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Advanced);
        WORKSTATION_EV = addItem(323, "circuit.workstation").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Extreme);
        MAINFRAME_IV = addItem(324, "circuit.mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Elite);

        // T4: Nano
        NANO_PROCESSOR_HV = addItem(325, "circuit.nano_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Advanced);
        NANO_PROCESSOR_ASSEMBLY_EV = addItem(326, "circuit.nano_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Extreme);
        NANO_COMPUTER_IV = addItem(327, "circuit.nano_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Elite);
        NANO_MAINFRAME_LUV = addItem(328, "circuit.nano_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Master);

        // T5: Quantum
        QUANTUM_PROCESSOR_EV = addItem(329, "circuit.quantum_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Extreme);
        QUANTUM_ASSEMBLY_IV = addItem(330, "circuit.quantum_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Elite);
        QUANTUM_COMPUTER_LUV = addItem(331, "circuit.quantum_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Master);
        QUANTUM_MAINFRAME_ZPM = addItem(332, "circuit.quantum_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Ultimate);

        // T6: Crystal
        CRYSTAL_PROCESSOR_IV = addItem(333, "circuit.crystal_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Elite);
        CRYSTAL_ASSEMBLY_LUV = addItem(334, "circuit.crystal_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Master);
        CRYSTAL_COMPUTER_ZPM = addItem(335, "circuit.crystal_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Ultimate);
        CRYSTAL_MAINFRAME_UV = addItem(336, "circuit.crystal_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Superconductor);

        // T7: Wetware
        WETWARE_PROCESSOR_LUV = addItem(337, "circuit.wetware_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Master);
        WETWARE_PROCESSOR_ASSEMBLY_ZPM = addItem(338, "circuit.wetware_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Ultimate);
        WETWARE_SUPER_COMPUTER_UV = addItem(339, "circuit.wetware_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Superconductor);
        WETWARE_MAINFRAME_UHV = addItem(340, "circuit.wetware_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.Infinite);

        TURBINE_ROTOR = addItem(341, "turbine_rotor").addComponents(new TurbineRotorBehavior());
        COVER_FACADE = addItem(342, "cover.facade").addComponents(new FacadeItem()).disableModelLoading();

        FLUID_REGULATORS[0] = FLUID_REGULATOR_LV = addItem(343, "fluid.regulator.lv");
        FLUID_REGULATORS[1] = FLUID_REGULATOR_MV = addItem(344, "fluid.regulator.mv");
        FLUID_REGULATORS[2] = FLUID_REGULATOR_HV = addItem(345, "fluid.regulator.hv");
        FLUID_REGULATORS[3] = FLUID_REGULATOR_EV = addItem(346, "fluid.regulator.ev");
        FLUID_REGULATORS[4] = FLUID_REGULATOR_IV = addItem(347, "fluid.regulator.iv");
        FLUID_REGULATORS[5] = FLUID_REGULATOR_LUV = addItem(348, "fluid.regulator.luv");
        FLUID_REGULATORS[6] = FLUID_REGULATOR_ZPM = addItem(349, "fluid.regulator.zpm");
        FLUID_REGULATORS[7] = FLUID_REGULATOR_UV = addItem(350, "fluid.regulator.uv");

        if (ConfigHolder.U.GT5u.enableZPMandUVBats) {
            ENERGY_MODULE = addItem(351, "energy.module").addComponents(new IItemComponent[] { ElectricStats.createRechargeableBattery(10000000000L, GTValues.ZPM) }).setModelAmount(8);
            ENERGY_CLUSTER = addItem(352, "energy.cluster").addComponents(new IItemComponent[] { ElectricStats.createRechargeableBattery(100000000000L, GTValues.UV) }).setModelAmount(8);
        }

        if (ConfigHolder.U.GT5u.replaceUVwithMAXBat) {
            MAX_BATTERY = addItem(353, "max.battery").addComponents(new IItemComponent[] { ElectricStats.createRechargeableBattery(Long.MAX_VALUE, GTValues.MAX) }).setModelAmount(8);
            MetaItems.ZPM2.setInvisible();
        }

        NEURO_PROCESSOR = addItem(354, "processor.neuro");
        STEM_CELLS = addItem(355, "stem_cells");
        PETRI_DISH = addItem(356, "petri_dish");

        CARBON_FIBERS = addItem(357, "carbon.fibers");
        CARBON_MESH = addItem(358, "carbon.mesh");
        CARBON_PLATE = addItem(359, "carbon.plate");

        VOLTAGE_COIL_ULV = addItem(360, "voltage_coil.ulv");
        VOLTAGE_COIL_LV = addItem(361, "voltage_coil.lv");
        VOLTAGE_COIL_MV = addItem(362, "voltage_coil.mv");
        VOLTAGE_COIL_HV = addItem(363, "voltage_coil.hv");
        VOLTAGE_COIL_EV = addItem(364, "voltage_coil.ev");
        VOLTAGE_COIL_IV = addItem(365, "voltage_coil.iv");
        VOLTAGE_COIL_LUV = addItem(366, "voltage_coil.luv");
        VOLTAGE_COIL_ZPM = addItem(367, "voltage_coil.zpm");
        VOLTAGE_COIL_UV = addItem(368, "voltage_coil.uv");
        /* IDs 368-373 (incl.) reserved for UHV-MAX tier voltage coils */
    }

    public void registerRecipes() {
        RecipeMaps.PACKER_RECIPES.recipeBuilder()
            .inputs(TOOL_MATCHES.getStackForm(16)).input(OrePrefix.plate, Materials.Paper)
            .outputs(TOOL_MATCHBOX.getStackForm())
            .duration(64)
            .EUt(16)
            .buildAndRegister();

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder().duration(30).EUt(4)
                .input(OrePrefix.dust, Materials.Tantalum)
                .input(OrePrefix.foil, Materials.Manganese)
                .fluidInputs(Materials.Polyethylene.getFluid(144))
                .outputs(MetaItems.BATTERY_RE_ULV_TANTALUM.getStackForm(8))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_SU_LV_SULFURIC_ACID.getStackForm())
            .outputs(BATTERY_HULL_LV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_SU_LV_MERCURY.getStackForm())
            .outputs(BATTERY_HULL_LV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_SU_MV_SULFURIC_ACID.getStackForm())
            .outputs(BATTERY_HULL_MV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_SU_MV_MERCURY.getStackForm())
            .outputs(BATTERY_HULL_MV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_SU_HV_SULFURIC_ACID.getStackForm())
            .outputs(BATTERY_HULL_HV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_SU_HV_MERCURY.getStackForm())
            .outputs(BATTERY_HULL_HV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_RE_LV_CADMIUM.getStackForm())
            .outputs(BATTERY_HULL_LV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_RE_LV_LITHIUM.getStackForm())
            .outputs(BATTERY_HULL_LV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_RE_LV_SODIUM.getStackForm())
            .outputs(BATTERY_HULL_LV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_RE_MV_CADMIUM.getStackForm())
            .outputs(BATTERY_HULL_MV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_RE_MV_LITHIUM.getStackForm())
            .outputs(BATTERY_HULL_MV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_RE_MV_SODIUM.getStackForm())
            .outputs(BATTERY_HULL_MV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_RE_HV_CADMIUM.getStackForm())
            .outputs(BATTERY_HULL_HV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_RE_HV_LITHIUM.getStackForm())
            .outputs(BATTERY_HULL_HV.getStackForm())
            .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
            .inputs(BATTERY_RE_HV_SODIUM.getStackForm())
            .outputs(BATTERY_HULL_HV.getStackForm())
            .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
            .inputs(BATTERY_HULL_LV.getStackForm())
            .input(OrePrefix.dust, Materials.Cadmium, 2)
            .outputs(BATTERY_RE_LV_CADMIUM.getStackForm())
            .duration(100).EUt(2)
            .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
            .inputs(BATTERY_HULL_LV.getStackForm())
            .input(OrePrefix.dust, Materials.Lithium, 2)
            .outputs(BATTERY_RE_LV_LITHIUM.getStackForm())
            .duration(100).EUt(2)
            .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
            .inputs(BATTERY_HULL_LV.getStackForm())
            .input(OrePrefix.dust, Materials.Sodium, 2)
            .outputs(BATTERY_RE_LV_SODIUM.getStackForm())
            .duration(100).EUt(2)
            .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
            .inputs(BATTERY_HULL_MV.getStackForm())
            .input(OrePrefix.dust, Materials.Cadmium, 8)
            .outputs(BATTERY_RE_MV_CADMIUM.getStackForm())
            .duration(400).EUt(2)
            .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
            .inputs(BATTERY_HULL_MV.getStackForm())
            .input(OrePrefix.dust, Materials.Lithium, 8)
            .outputs(BATTERY_RE_MV_LITHIUM.getStackForm())
            .duration(400).EUt(2)
            .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
            .inputs(BATTERY_HULL_MV.getStackForm())
            .input(OrePrefix.dust, Materials.Sodium, 8)
            .outputs(BATTERY_RE_MV_SODIUM.getStackForm())
            .duration(400).EUt(2)
            .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
            .inputs(BATTERY_HULL_HV.getStackForm())
            .input(OrePrefix.dust, Materials.Cadmium, 16)
            .outputs(BATTERY_RE_HV_CADMIUM.getStackForm())
            .duration(1600).EUt(2)
            .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
            .inputs(BATTERY_HULL_HV.getStackForm())
            .input(OrePrefix.dust, Materials.Lithium, 16)
            .outputs(BATTERY_RE_HV_LITHIUM.getStackForm())
            .duration(1600).EUt(2)
            .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
            .inputs(BATTERY_HULL_HV.getStackForm())
            .input(OrePrefix.dust, Materials.Sodium, 16)
            .outputs(BATTERY_RE_HV_SODIUM.getStackForm())
            .duration(1600).EUt(2)
            .buildAndRegister();

        // Dyes recipes
        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.RED_FLOWER, 1, 0))
                .outputs(new ItemStack(Items.DYE, 2, 1))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.RED_FLOWER, 1, 1))
                .outputs(new ItemStack(Items.DYE, 2, 12))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.RED_FLOWER, 1, 2))
                .outputs(new ItemStack(Items.DYE, 2, 13))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.RED_FLOWER, 1, 3))
                .outputs(new ItemStack(Items.DYE, 2, 7))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.RED_FLOWER, 1, 4))
                .outputs(new ItemStack(Items.DYE, 2, 1))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.RED_FLOWER, 1, 5))
                .outputs(new ItemStack(Items.DYE, 2, 14))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.RED_FLOWER, 1, 6))
                .outputs(new ItemStack(Items.DYE, 2, 7))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.RED_FLOWER, 1, 7))
                .outputs(new ItemStack(Items.DYE, 2, 9))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.RED_FLOWER, 1, 8))
                .outputs(new ItemStack(Items.DYE, 2, 7))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.YELLOW_FLOWER, 1, 0))
                .outputs(new ItemStack(Items.DYE, 2, 11))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.DOUBLE_PLANT, 1, 0))
                .outputs(new ItemStack(Items.DYE, 3, 11))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.DOUBLE_PLANT, 1, 1))
                .outputs(new ItemStack(Items.DYE, 3, 13))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.DOUBLE_PLANT, 1, 4))
                .outputs(new ItemStack(Items.DYE, 3, 1))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.DOUBLE_PLANT, 1, 5))
                .outputs(new ItemStack(Items.DYE, 3, 9))
                .buildAndRegister();

        RecipeMaps.EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Items.BEETROOT, 1))
                .outputs(new ItemStack(Items.DYE, 2, 1))
                .buildAndRegister();

        // Misc
        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Items.DYE, 1, EnumDyeColor.BROWN.getDyeDamage()))
                .outputs(OreDictUnifier.get(OrePrefix.dust, Materials.Cocoa, 1))
                .duration(400)
                .EUt(2)
                .buildAndRegister();

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Items.REEDS, 1))
                .outputs(new ItemStack(Items.SUGAR, 1))
                .duration(400)
                .EUt(2)
                .buildAndRegister();

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.MELON_BLOCK, 1, 0))
                .outputs(new ItemStack(Items.MELON, 8, 0))
                .chancedOutput(new ItemStack(Items.MELON_SEEDS, 1), 8000, 500)
                .duration(400)
                .EUt(2)
                .buildAndRegister();

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.PUMPKIN, 1, 0))
                .outputs(new ItemStack(Items.PUMPKIN_SEEDS, 4, 0))
                .duration(400)
                .EUt(2)
                .buildAndRegister();

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Items.MELON, 1, 0))
                .outputs(new ItemStack(Items.MELON_SEEDS, 1, 0))
                .duration(400)
                .EUt(2)
                .buildAndRegister();

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .inputs(CountableIngredient.from("blockWool", 1))
                .outputs(new ItemStack(Items.STRING, 3))
                .chancedOutput(new ItemStack(Items.STRING, 1), 2000, 800)
                .duration(400)
                .EUt(2)
                .buildAndRegister();
    }

}
