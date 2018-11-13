package nightkosh.gravestone_extended.item.armor.bone.leggings;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nightkosh.gravestone_extended.core.GSTabs;
import nightkosh.gravestone_extended.core.ModInfo;
import nightkosh.gravestone_extended.core.Resources;
import nightkosh.gravestone_extended.models.armor.ArmorModelsHelper;

import javax.annotation.Nullable;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemBoneLeggings extends ItemArmor implements IBoneLeggins {

    public ItemBoneLeggings() {
        super(ArmorMaterial.LEATHER, 1, EntityEquipmentSlot.LEGS);//TODO material !!
        this.setUnlocalizedName("gravestone.bone_leggings");
        this.setRegistryName(ModInfo.ID, "bone_leggings");
        this.setCreativeTab(GSTabs.otherItemsTab);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return Resources.BONE_LEGS;
    }

    @Nullable
    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack stack, EntityEquipmentSlot armorSlot, ModelBiped defaultModel) {
        if (!stack.isEmpty() && stack.getItem() instanceof ItemArmor) {
            return ArmorModelsHelper.BONE_LEGGINGS;
        }
        return null;
    }
}
