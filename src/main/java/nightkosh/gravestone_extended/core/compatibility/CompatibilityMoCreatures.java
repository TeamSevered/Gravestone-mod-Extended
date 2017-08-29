package nightkosh.gravestone_extended.core.compatibility;

import net.minecraft.util.ResourceLocation;
import nightkosh.gravestone_extended.config.ExtendedConfig;
import nightkosh.gravestone_extended.core.MobSpawn;
import nightkosh.gravestone_extended.core.logger.GSLogger;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

import java.lang.reflect.Constructor;
import java.util.List;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class CompatibilityMoCreatures {

    protected static boolean isInstalled = false;

    // mobs classes
    public static final String MO_CREATURES_S_SKELETON = "drzhark.mocreatures.entity.monster.MoCEntitySilverSkeleton";
    public static final String MO_CREATURES_WRAITH = "drzhark.mocreatures.entity.monster.MoCEntityWraith";
    public static final String MO_CREATURES_F_WRAITH = "drzhark.mocreatures.entity.monster.MoCEntityFlameWraith";
    public static final String MO_CREATURES_SCORPIONS = "drzhark.mocreatures.entity.monster.MoCEntityScorpion";

    private CompatibilityMoCreatures() {
    }

    public static void addMobs() {
        if (ExtendedConfig.spawnMoCreaturesMobs) {
            GSLogger.logInfo("start Mo'Creatures mobs loading");

            //TODO !!!!!!!!!!!!!!!!!!!!!!!!!!!!
//            addMobToList(MobSpawn.MOB_ID, "SilverSkeleton", getForeinMobConstructor(CompatibilityMoCreatures.MO_CREATURES_S_SKELETON));
//            addMobToList(MobSpawn.MOB_ID, "Wraith", getForeinMobConstructor(CompatibilityMoCreatures.MO_CREATURES_WRAITH));
//            addMobToList(MobSpawn.HELL_MOB_ID, "FlameWraith", getForeinMobConstructor(CompatibilityMoCreatures.MO_CREATURES_F_WRAITH));
//
//
//            addMobToList(MobSpawn.skeletonSpawnerMobs, "SilverSkeleton", getForeinMobConstructor(CompatibilityMoCreatures.MO_CREATURES_S_SKELETON));

            GSLogger.logInfo("end Mo'Creatures mobs loading");
        }
    }

    /**
     * Return constructor for forein mobs classes based on class path
     *
     * @param path Class Path with name
     */
    private static Constructor getForeinMobConstructor(String path) {
        Constructor<EntityLiving> constructor = null;

        try {
            Class mobClass = Class.forName(path);
            constructor = mobClass.getConstructor(World.class);
        } catch (ClassNotFoundException e) {
            GSLogger.logError("getForeinMobConstructor ClassNotFoundException. class path " + path);
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            GSLogger.logError("getForeinMobConstructor NoSuchMethodException. class path " + path);
            e.printStackTrace();
        }

        return constructor;
    }

    private static void addMobToList(List<ResourceLocation> MOB_ID, ResourceLocation mobName, Constructor<EntityLiving> constructor) {
        if (constructor != null) {
            MOB_ID.add(mobName);
            MobSpawn.mobNameToClassMapping.put(mobName, constructor);
        }
    }

    public static boolean isLoaded() {
        return isInstalled;
    }
}
