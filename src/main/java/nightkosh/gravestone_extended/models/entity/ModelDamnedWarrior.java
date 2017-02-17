package nightkosh.gravestone_extended.models.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import nightkosh.gravestone.models.IModelBaseAdapter;
import nightkosh.gravestone.models.ModelRendererSkull;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ModelDamnedWarrior extends ModelBase implements IModelBaseAdapter {

    protected ModelRendererSkull skull;


    ModelRenderer leftLeg1;
    ModelRenderer leftLeg11;
    ModelRenderer leftLeg2;
    ModelRenderer leftfoot1;
    ModelRenderer leftfoot2;
    ModelRenderer rightLeg1;
    ModelRenderer rightLeg11;
    ModelRenderer rightLeg2;
    ModelRenderer rightfoot1;
    ModelRenderer rightfoot2;
    ModelRenderer pelvicBone1;
    ModelRenderer pelvicBone2;
    ModelRenderer pelvicBone3;
    ModelRenderer pelvicBone4;
    ModelRenderer pelvicBone5;
    ModelRenderer pelvicBone6;
    ModelRenderer pelvicBone7;
    ModelRenderer spine1;
    ModelRenderer spine2;
    ModelRenderer spine3;
    ModelRenderer spine4;
    ModelRenderer spine5;
    ModelRenderer spine6;
    ModelRenderer spine7;
    ModelRenderer spine8;
    ModelRenderer spine9;
    ModelRenderer spine10;
    ModelRenderer spine11;
    ModelRenderer spine12;
    ModelRenderer spine13;
    ModelRenderer spine14;
    ModelRenderer spine15;
    ModelRenderer spine16;
    ModelRenderer spine17;
    ModelRenderer spine18;
    ModelRenderer spine19;
    ModelRenderer spine20;
    ModelRenderer spine21;
    ModelRenderer chest;
    ModelRenderer ribRight1;
    ModelRenderer ribRight12;
    ModelRenderer ribRight13;
    ModelRenderer ribRight2;
    ModelRenderer ribRight22;
    ModelRenderer ribRight23;
    ModelRenderer ribRight3;
    ModelRenderer ribRight32;
    ModelRenderer ribRight33;
    ModelRenderer ribRight4;
    ModelRenderer ribRight42;
    ModelRenderer ribRight43;
    ModelRenderer ribRight5;
    ModelRenderer ribRight52;
    ModelRenderer ribRight53;
    ModelRenderer ribLeft1;
    ModelRenderer ribLeft12;
    ModelRenderer ribLeft13;
    ModelRenderer ribLeft2;
    ModelRenderer ribLeft22;
    ModelRenderer ribLeft23;
    ModelRenderer ribLeft3;
    ModelRenderer ribLeft32;
    ModelRenderer ribLeft33;
    ModelRenderer ribLeft4;
    ModelRenderer ribLeft42;
    ModelRenderer ribLeft43;
    ModelRenderer ribLeft5;
    ModelRenderer ribLeft52;
    ModelRenderer ribLeft53;
    ModelRenderer leftArm1;
    ModelRenderer leftArm21;
    ModelRenderer leftArm22;
    ModelRenderer rightArm1;
    ModelRenderer rightArm21;
    ModelRenderer rightArm22;

    private float skullRotation = 0;

    public ModelDamnedWarrior() {

        skull = new ModelRendererSkull(this, -4, -8, -4, 0, -15, 2);
        setRotation(skull, 0.1745329F, 0, 0);

        textureWidth = 128;
        textureHeight = 64;

        leftLeg1 = new ModelRenderer(this, 0, 0);
        leftLeg1.addBox(0F, 0F, 0F, 1, 8, 1);
        leftLeg1.setRotationPoint(2.5F, 16F, -0.2F);
        leftLeg1.setTextureSize(128, 64);
        leftLeg1.mirror = true;
        setRotation(leftLeg1, 0.1047198F, 0F, 0F);
        leftLeg11 = new ModelRenderer(this, 7, 0);
        leftLeg11.addBox(0F, 0F, 0F, 1, 8, 1);
        leftLeg11.setRotationPoint(2.5F, 16F, 1.2F);
        leftLeg11.setTextureSize(128, 64);
        leftLeg11.mirror = true;
        setRotation(leftLeg11, 0.0523599F, 0F, 0F);
        leftLeg2 = new ModelRenderer(this, 12, 0);
        leftLeg2.addBox(0F, 0F, 0F, 1, 8, 2);
        leftLeg2.setRotationPoint(2.5F, 8F, 0.8F);
        leftLeg2.setTextureSize(128, 64);
        leftLeg2.mirror = true;
        setRotation(leftLeg2, -0.1047198F, 0F, 0F);
        leftfoot1 = new ModelRenderer(this, 19, 0);
        leftfoot1.addBox(0F, 0F, 0F, 1, 1, 5);
        leftfoot1.setRotationPoint(1.8F, 23.5F, -3F);
        leftfoot1.setTextureSize(128, 64);
        leftfoot1.mirror = true;
        setRotation(leftfoot1, 0F, 0.0523599F, 0F);
        leftfoot2 = new ModelRenderer(this, 19, 0);
        leftfoot2.addBox(0F, 0F, 0F, 1, 1, 5);
        leftfoot2.setRotationPoint(3F, 23.5F, -3F);
        leftfoot2.setTextureSize(128, 64);
        leftfoot2.mirror = true;
        setRotation(leftfoot2, 0F, -0.0523599F, 0F);
        rightLeg1 = new ModelRenderer(this, 0, 0);
        rightLeg1.addBox(0F, 0F, 0F, 1, 8, 1);
        rightLeg1.setRotationPoint(-2.5F, 16F, -0.2F);
        rightLeg1.setTextureSize(128, 64);
        rightLeg1.mirror = true;
        setRotation(rightLeg1, 0.1047198F, 0F, 0F);
        rightLeg11 = new ModelRenderer(this, 7, 0);
        rightLeg11.addBox(0F, 0F, 0F, 1, 8, 1);
        rightLeg11.setRotationPoint(-2.5F, 16F, 1.2F);
        rightLeg11.setTextureSize(128, 64);
        rightLeg11.mirror = true;
        setRotation(rightLeg11, 0.0523599F, 0F, 0F);
        rightLeg2 = new ModelRenderer(this, 12, 0);
        rightLeg2.addBox(0F, 0F, 0F, 1, 8, 2);
        rightLeg2.setRotationPoint(-2.5F, 8F, 0.8F);
        rightLeg2.setTextureSize(128, 64);
        rightLeg2.mirror = true;
        setRotation(rightLeg2, -0.1047198F, 0F, 0F);
        rightfoot1 = new ModelRenderer(this, 19, 0);
        rightfoot1.addBox(0F, 0F, 0F, 1, 1, 5);
        rightfoot1.setRotationPoint(-3F, 23.5F, -3F);
        rightfoot1.setTextureSize(128, 64);
        rightfoot1.mirror = true;
        setRotation(rightfoot1, 0F, 0.0523599F, 0F);
        rightfoot2 = new ModelRenderer(this, 19, 0);
        rightfoot2.addBox(0F, 0F, 0F, 1, 1, 5);
        rightfoot2.setRotationPoint(-1.8F, 23.5F, -3F);
        rightfoot2.setTextureSize(128, 64);
        rightfoot2.mirror = true;
        setRotation(rightfoot2, 0F, -0.0523599F, 0F);
        pelvicBone1 = new ModelRenderer(this, 0, 11);
        pelvicBone1.addBox(0F, 0F, 0F, 3, 1, 2);
        pelvicBone1.setRotationPoint(-3F, 7F, 0F);
        pelvicBone1.setTextureSize(128, 64);
        pelvicBone1.mirror = true;
        setRotation(pelvicBone1, 0F, 0F, 0F);
        pelvicBone2 = new ModelRenderer(this, 11, 11);
        pelvicBone2.addBox(0F, 0F, 0F, 3, 1, 2);
        pelvicBone2.setRotationPoint(1F, 7F, 0F);
        pelvicBone2.setTextureSize(128, 64);
        pelvicBone2.mirror = true;
        setRotation(pelvicBone2, 0F, 0F, 0F);
        pelvicBone3 = new ModelRenderer(this, 0, 15);
        pelvicBone3.addBox(0F, 0F, 0F, 7, 2, 1);
        pelvicBone3.setRotationPoint(-3F, 6F, 2F);
        pelvicBone3.setTextureSize(128, 64);
        pelvicBone3.mirror = true;
        setRotation(pelvicBone3, 0F, 0F, 0F);
        pelvicBone4 = new ModelRenderer(this, 0, 19);
        pelvicBone4.addBox(0F, 0F, 0F, 1, 4, 3);
        pelvicBone4.setRotationPoint(-4F, 4F, 0F);
        pelvicBone4.setTextureSize(128, 64);
        pelvicBone4.mirror = true;
        setRotation(pelvicBone4, 0F, 0F, 0F);
        pelvicBone5 = new ModelRenderer(this, 9, 19);
        pelvicBone5.addBox(0F, 0F, 0F, 1, 4, 3);
        pelvicBone5.setRotationPoint(4F, 4F, 0F);
        pelvicBone5.setTextureSize(128, 64);
        pelvicBone5.mirror = true;
        setRotation(pelvicBone5, 0F, 0F, 0F);
        pelvicBone6 = new ModelRenderer(this, 17, 15);
        pelvicBone6.addBox(0F, 0F, 0F, 1, 1, 1);
        pelvicBone6.setRotationPoint(-3F, 5F, 2F);
        pelvicBone6.setTextureSize(128, 64);
        pelvicBone6.mirror = true;
        setRotation(pelvicBone6, 0F, 0F, 0F);
        pelvicBone7 = new ModelRenderer(this, 17, 15);
        pelvicBone7.addBox(0F, 0F, 0F, 1, 1, 1);
        pelvicBone7.setRotationPoint(3F, 5F, 2F);
        pelvicBone7.setTextureSize(128, 64);
        pelvicBone7.mirror = true;
        setRotation(pelvicBone7, 0F, 0F, 0F);
        spine1 = new ModelRenderer(this, 19, 7);
        spine1.addBox(0F, 0F, 0F, 1, 1, 1);
        spine1.setRotationPoint(0F, 5.1F, 2F);
        spine1.setTextureSize(128, 64);
        spine1.mirror = true;
        setRotation(spine1, 0F, 0F, 0F);
        spine2 = new ModelRenderer(this, 19, 7);
        spine2.addBox(0F, 0F, 0F, 1, 1, 1);
        spine2.setRotationPoint(0F, 4F, 2F);
        spine2.setTextureSize(128, 64);
        spine2.mirror = true;
        setRotation(spine2, 0F, 0F, 0F);
        spine3 = new ModelRenderer(this, 19, 7);
        spine3.addBox(0F, 0F, 0F, 1, 1, 1);
        spine3.setRotationPoint(0F, 2.9F, 1.9F);
        spine3.setTextureSize(128, 64);
        spine3.mirror = true;
        setRotation(spine3, 0F, 0F, 0F);
        spine4 = new ModelRenderer(this, 19, 7);
        spine4.addBox(0F, 0F, 0F, 1, 1, 1);
        spine4.setRotationPoint(0F, 1.8F, 1.8F);
        spine4.setTextureSize(128, 64);
        spine4.mirror = true;
        setRotation(spine4, 0F, 0F, 0F);
        spine5 = new ModelRenderer(this, 19, 7);
        spine5.addBox(0F, 0F, 0F, 1, 1, 1);
        spine5.setRotationPoint(0F, 0.7F, 1.7F);
        spine5.setTextureSize(128, 64);
        spine5.mirror = true;
        setRotation(spine5, 0F, 0F, 0F);
        spine6 = new ModelRenderer(this, 19, 7);
        spine6.addBox(0F, 0F, 0F, 1, 1, 1);
        spine6.setRotationPoint(0F, -0.4F, 1.7F);
        spine6.setTextureSize(128, 64);
        spine6.mirror = true;
        setRotation(spine6, 0F, 0F, 0F);
        spine7 = new ModelRenderer(this, 19, 7);
        spine7.addBox(0F, 0F, 0F, 1, 1, 1);
        spine7.setRotationPoint(0F, -1.5F, 1.8F);
        spine7.setTextureSize(128, 64);
        spine7.mirror = true;
        setRotation(spine7, 0F, 0F, 0F);
        spine8 = new ModelRenderer(this, 19, 7);
        spine8.addBox(0F, 0F, 0F, 1, 1, 1);
        spine8.setRotationPoint(0F, -2.6F, 1.9F);
        spine8.setTextureSize(128, 64);
        spine8.mirror = true;
        setRotation(spine8, 0F, 0F, 0F);
        spine9 = new ModelRenderer(this, 19, 7);
        spine9.addBox(0F, 0F, 0F, 1, 1, 1);
        spine9.setRotationPoint(0F, -3.7F, 2F);
        spine9.setTextureSize(128, 64);
        spine9.mirror = true;
        setRotation(spine9, 0F, 0F, 0F);
        spine10 = new ModelRenderer(this, 19, 7);
        spine10.addBox(0F, 0F, 0F, 1, 1, 1);
        spine10.setRotationPoint(0F, -4.8F, 2.1F);
        spine10.setTextureSize(128, 64);
        spine10.mirror = true;
        setRotation(spine10, 0F, 0F, 0F);
        spine11 = new ModelRenderer(this, 19, 7);
        spine11.addBox(0F, 0F, 0F, 1, 1, 1);
        spine11.setRotationPoint(0F, -5.9F, 2.3F);
        spine11.setTextureSize(128, 64);
        spine11.mirror = true;
        setRotation(spine11, 0F, 0F, 0F);
        spine12 = new ModelRenderer(this, 19, 7);
        spine12.addBox(0F, 0F, 0F, 1, 1, 1);
        spine12.setRotationPoint(0F, -7F, 2.5F);
        spine12.setTextureSize(128, 64);
        spine12.mirror = true;
        setRotation(spine12, 0F, 0F, 0F);
        spine13 = new ModelRenderer(this, 19, 7);
        spine13.addBox(0F, 0F, 0F, 1, 1, 1);
        spine13.setRotationPoint(0F, -8.1F, 2.7F);
        spine13.setTextureSize(128, 64);
        spine13.mirror = true;
        setRotation(spine13, 0F, 0F, 0F);
        spine14 = new ModelRenderer(this, 19, 7);
        spine14.addBox(0F, 0F, 0F, 1, 1, 1);
        spine14.setRotationPoint(0F, -9.2F, 2.7F);
        spine14.setTextureSize(128, 64);
        spine14.mirror = true;
        setRotation(spine14, 0F, 0F, 0F);
        spine15 = new ModelRenderer(this, 19, 7);
        spine15.addBox(0F, 0F, 0F, 1, 1, 1);
        spine15.setRotationPoint(0F, -10.3F, 2.7F);
        spine15.setTextureSize(128, 64);
        spine15.mirror = true;
        setRotation(spine15, 0F, 0F, 0F);
        spine16 = new ModelRenderer(this, 19, 7);
        spine16.addBox(0F, 0F, 0F, 1, 1, 1);
        spine16.setRotationPoint(0F, -11.4F, 2.5F);
        spine16.setTextureSize(128, 64);
        spine16.mirror = true;
        setRotation(spine16, 0F, 0F, 0F);
        spine17 = new ModelRenderer(this, 19, 7);
        spine17.addBox(0F, 0F, 0F, 1, 1, 1);
        spine17.setRotationPoint(0F, -12.5F, 2.3F);
        spine17.setTextureSize(128, 64);
        spine17.mirror = true;
        setRotation(spine17, 0F, 0F, 0F);
        spine18 = new ModelRenderer(this, 19, 7);
        spine18.addBox(0F, 0F, 0F, 1, 1, 1);
        spine18.setRotationPoint(0F, -13.6F, 2.1F);
        spine18.setTextureSize(128, 64);
        spine18.mirror = true;
        setRotation(spine18, 0F, 0F, 0F);
        spine19 = new ModelRenderer(this, 19, 7);
        spine19.addBox(0F, 0F, 0F, 1, 1, 1);
        spine19.setRotationPoint(0F, -14.7F, 2F);
        spine19.setTextureSize(128, 64);
        spine19.mirror = true;
        setRotation(spine19, 0F, 0F, 0F);
        spine20 = new ModelRenderer(this, 19, 7);
        spine20.addBox(0F, 0F, 0F, 1, 1, 1);
        spine20.setRotationPoint(0F, -15.8F, 1.9F);
        spine20.setTextureSize(128, 64);
        spine20.mirror = true;
        setRotation(spine20, 0F, 0F, 0F);
        spine21 = new ModelRenderer(this, 19, 7);
        spine21.addBox(0F, 0F, 0F, 1, 1, 1);
        spine21.setRotationPoint(0F, -16.9F, 2F);
        spine21.setTextureSize(128, 64);
        spine21.mirror = true;
        setRotation(spine21, 0F, 0F, 0F);
        chest = new ModelRenderer(this, 32, 0);
        chest.addBox(0F, 0F, 0F, 1, 8, 1);
        chest.setRotationPoint(0F, -13F, -2.3F);
        chest.setTextureSize(128, 64);
        chest.mirror = true;
        setRotation(chest, 0.0349066F, 0F, 0F);
        ribRight1 = new ModelRenderer(this, 37, 0);
        ribRight1.addBox(0F, 0F, 0F, 7, 1, 1);
        ribRight1.setRotationPoint(-7F, -13.5F, 2F);
        ribRight1.setTextureSize(128, 64);
        ribRight1.mirror = true;
        setRotation(ribRight1, 0F, 0F, 0.0698132F);
        ribRight12 = new ModelRenderer(this, 54, 0);
        ribRight12.addBox(0F, 0F, 0F, 1, 1, 4);
        ribRight12.setRotationPoint(-7F, -13.5F, -2F);
        ribRight12.setTextureSize(128, 64);
        ribRight12.mirror = true;
        setRotation(ribRight12, 0F, 0F, 0F);
        ribRight13 = new ModelRenderer(this, 37, 3);
        ribRight13.addBox(0F, 0F, 0F, 6, 1, 1);
        ribRight13.setRotationPoint(-6F, -13.4F, -1.9F);
        ribRight13.setTextureSize(128, 64);
        ribRight13.mirror = true;
        setRotation(ribRight13, 0F, 0.0698132F, 0.0698132F);
        ribRight2 = new ModelRenderer(this, 37, 6);
        ribRight2.addBox(0F, 0F, 0F, 6, 1, 1);
        ribRight2.setRotationPoint(-6F, -11.3F, 2.6F);
        ribRight2.setTextureSize(128, 64);
        ribRight2.mirror = true;
        setRotation(ribRight2, 0F, 0F, 0.0523599F);
        ribRight22 = new ModelRenderer(this, 54, 6);
        ribRight22.addBox(0F, 0F, 0F, 1, 1, 5);
        ribRight22.setRotationPoint(-6F, -11.3F, -2.2F);
        ribRight22.setTextureSize(128, 64);
        ribRight22.mirror = true;
        setRotation(ribRight22, 0F, 0F, 0F);
        ribRight23 = new ModelRenderer(this, 37, 9);
        ribRight23.addBox(0F, 0F, 0F, 5, 1, 1);
        ribRight23.setRotationPoint(-5F, -11.3F, -2.2F);
        ribRight23.setTextureSize(128, 64);
        ribRight23.mirror = true;
        setRotation(ribRight23, 0F, 0F, 0.0523599F);
        ribRight3 = new ModelRenderer(this, 37, 13);
        ribRight3.addBox(0F, 0F, 0F, 6, 1, 1);
        ribRight3.setRotationPoint(-6F, -9.2F, 2.6F);
        ribRight3.setTextureSize(128, 64);
        ribRight3.mirror = true;
        setRotation(ribRight3, 0F, 0F, 0.0349066F);
        ribRight32 = new ModelRenderer(this, 54, 13);
        ribRight32.addBox(0F, 0F, 0F, 1, 1, 5);
        ribRight32.setRotationPoint(-6F, -9.2F, -2F);
        ribRight32.setTextureSize(128, 64);
        ribRight32.mirror = true;
        setRotation(ribRight32, 0F, 0F, 0F);
        ribRight33 = new ModelRenderer(this, 37, 16);
        ribRight33.addBox(0F, 0F, 0F, 5, 1, 1);
        ribRight33.setRotationPoint(-5F, -9.2F, -2F);
        ribRight33.setTextureSize(128, 64);
        ribRight33.mirror = true;
        setRotation(ribRight33, 0F, 0F, 0.0349066F);
        ribRight4 = new ModelRenderer(this, 37, 20);
        ribRight4.addBox(0F, 0F, 0F, 6, 1, 1);
        ribRight4.setRotationPoint(-6F, -7F, 2.4F);
        ribRight4.setTextureSize(128, 64);
        ribRight4.mirror = true;
        setRotation(ribRight4, 0F, 0F, 0F);
        ribRight42 = new ModelRenderer(this, 54, 20);
        ribRight42.addBox(0F, 0F, 0F, 1, 1, 5);
        ribRight42.setRotationPoint(-6F, -7F, -2F);
        ribRight42.setTextureSize(128, 64);
        ribRight42.mirror = true;
        setRotation(ribRight42, 0F, 0F, 0F);
        ribRight43 = new ModelRenderer(this, 37, 23);
        ribRight43.addBox(0F, 0F, 0F, 5, 1, 1);
        ribRight43.setRotationPoint(-5F, -7F, -2F);
        ribRight43.setTextureSize(128, 64);
        ribRight43.mirror = true;
        setRotation(ribRight43, 0F, 0F, 0F);
        ribRight5 = new ModelRenderer(this, 37, 27);
        ribRight5.addBox(0F, 0F, 0F, 5, 1, 1);
        ribRight5.setRotationPoint(-5F, -4.8F, 2.1F);
        ribRight5.setTextureSize(128, 64);
        ribRight5.mirror = true;
        setRotation(ribRight5, 0F, 0F, -0.0349066F);
        ribRight52 = new ModelRenderer(this, 54, 27);
        ribRight52.addBox(0F, 0F, 0F, 1, 1, 4);
        ribRight52.setRotationPoint(-5F, -4.8F, -2F);
        ribRight52.setTextureSize(128, 64);
        ribRight52.mirror = true;
        setRotation(ribRight52, 0F, 0F, -0.0349066F);
        ribRight53 = new ModelRenderer(this, 37, 30);
        ribRight53.addBox(0F, 0F, 0F, 2, 1, 1);
        ribRight53.setRotationPoint(-4F, -4.8F, -2F);
        ribRight53.setTextureSize(128, 64);
        ribRight53.mirror = true;
        setRotation(ribRight53, 0F, 0F, -0.0349066F);
        ribLeft1 = new ModelRenderer(this, 67, 0);
        ribLeft1.addBox(0F, 0F, 0F, 7, 1, 1);
        ribLeft1.setRotationPoint(1F, -13F, 2F);
        ribLeft1.setTextureSize(128, 64);
        ribLeft1.mirror = true;
        setRotation(ribLeft1, 0F, 0F, -0.0698132F);
        ribLeft12 = new ModelRenderer(this, 84, 0);
        ribLeft12.addBox(0F, 0F, 0F, 1, 1, 4);
        ribLeft12.setRotationPoint(7F, -13.4F, -1.8F);
        ribLeft12.setTextureSize(128, 64);
        ribLeft12.mirror = true;
        setRotation(ribLeft12, 0F, 0F, 0F);
        ribLeft13 = new ModelRenderer(this, 67, 3);
        ribLeft13.addBox(0F, 0F, 0F, 6, 1, 1);
        ribLeft13.setRotationPoint(1F, -13F, -2.2F);
        ribLeft13.setTextureSize(128, 64);
        ribLeft13.mirror = true;
        setRotation(ribLeft13, 0F, -0.0698132F, -0.0698132F);
        ribLeft2 = new ModelRenderer(this, 67, 6);
        ribLeft2.addBox(0F, 0F, 0F, 6, 1, 1);
        ribLeft2.setRotationPoint(1F, -11F, 2.6F);
        ribLeft2.setTextureSize(128, 64);
        ribLeft2.mirror = true;
        setRotation(ribLeft2, 0F, 0F, -0.0523599F);
        ribLeft22 = new ModelRenderer(this, 84, 6);
        ribLeft22.addBox(0F, 0F, 0F, 1, 1, 5);
        ribLeft22.setRotationPoint(6F, -11.3F, -2.2F);
        ribLeft22.setTextureSize(128, 64);
        ribLeft22.mirror = true;
        setRotation(ribLeft22, 0F, 0F, 0F);
        ribLeft23 = new ModelRenderer(this, 67, 9);
        ribLeft23.addBox(0F, 0F, 0F, 5, 1, 1);
        ribLeft23.setRotationPoint(1F, -11F, -2.2F);
        ribLeft23.setTextureSize(128, 64);
        ribLeft23.mirror = true;
        setRotation(ribLeft23, 0F, 0F, -0.0523599F);
        ribLeft3 = new ModelRenderer(this, 67, 13);
        ribLeft3.addBox(0F, 0F, 0F, 6, 1, 1);
        ribLeft3.setRotationPoint(1F, -9F, 2.6F);
        ribLeft3.setTextureSize(128, 64);
        ribLeft3.mirror = true;
        setRotation(ribLeft3, 0F, 0F, -0.0349066F);
        ribLeft32 = new ModelRenderer(this, 84, 13);
        ribLeft32.addBox(0F, 0F, 0F, 1, 1, 5);
        ribLeft32.setRotationPoint(5.9F, -9.2F, -2F);
        ribLeft32.setTextureSize(128, 64);
        ribLeft32.mirror = true;
        setRotation(ribLeft32, 0F, 0.0523599F, 0F);
        ribLeft33 = new ModelRenderer(this, 67, 16);
        ribLeft33.addBox(0F, 0F, 0F, 5, 1, 1);
        ribLeft33.setRotationPoint(1F, -9F, -2F);
        ribLeft33.setTextureSize(128, 64);
        ribLeft33.mirror = true;
        setRotation(ribLeft33, 0F, 0F, -0.0349066F);
        ribLeft4 = new ModelRenderer(this, 67, 20);
        ribLeft4.addBox(0F, 0F, 0F, 6, 1, 1);
        ribLeft4.setRotationPoint(1F, -7F, 2.4F);
        ribLeft4.setTextureSize(128, 64);
        ribLeft4.mirror = true;
        setRotation(ribLeft4, 0F, 0F, 0F);
        ribLeft42 = new ModelRenderer(this, 84, 20);
        ribLeft42.addBox(0F, 0F, 0F, 1, 1, 5);
        ribLeft42.setRotationPoint(6F, -7F, -2F);
        ribLeft42.setTextureSize(128, 64);
        ribLeft42.mirror = true;
        setRotation(ribLeft42, 0F, 0F, 0F);
        ribLeft43 = new ModelRenderer(this, 67, 23);
        ribLeft43.addBox(0F, 0F, 0F, 5, 1, 1);
        ribLeft43.setRotationPoint(1F, -7F, -2F);
        ribLeft43.setTextureSize(128, 64);
        ribLeft43.mirror = true;
        setRotation(ribLeft43, 0F, 0F, 0F);
        ribLeft5 = new ModelRenderer(this, 67, 27);
        ribLeft5.addBox(0F, 0F, 0F, 5, 1, 1);
        ribLeft5.setRotationPoint(1F, -5F, 2.1F);
        ribLeft5.setTextureSize(128, 64);
        ribLeft5.mirror = true;
        setRotation(ribLeft5, 0F, 0F, 0.0349066F);
        ribLeft52 = new ModelRenderer(this, 84, 27);
        ribLeft52.addBox(0F, 0F, 0F, 1, 1, 4);
        ribLeft52.setRotationPoint(5F, -5F, -2F);
        ribLeft52.setTextureSize(128, 64);
        ribLeft52.mirror = true;
        setRotation(ribLeft52, -0.0349066F, 0F, 0.0349066F);
        ribLeft53 = new ModelRenderer(this, 67, 30);
        ribLeft53.addBox(0F, 0F, 0F, 2, 1, 1);
        ribLeft53.setRotationPoint(3F, -5F, -2F);
        ribLeft53.setTextureSize(128, 64);
        ribLeft53.mirror = true;
        setRotation(ribLeft53, 0F, 0F, 0.0349066F);
        leftArm1 = new ModelRenderer(this, 0, 28);
        leftArm1.addBox(0F, 0F, 0F, 1, 9, 2);
        leftArm1.setRotationPoint(7F, -13F, 0F);
        leftArm1.setTextureSize(128, 64);
        leftArm1.mirror = true;
        setRotation(leftArm1, 0.1745329F, 0F, -0.1745329F);
        leftArm21 = new ModelRenderer(this, 7, 28);
        leftArm21.addBox(0F, 0F, 0F, 1, 8, 1);
        leftArm21.setRotationPoint(8.5F, -5F, 1.5F);
        leftArm21.setTextureSize(128, 64);
        leftArm21.mirror = true;
        setRotation(leftArm21, -0.7504916F, 0F, 0F);
        leftArm22 = new ModelRenderer(this, 12, 28);
        leftArm22.addBox(0F, 0F, 0F, 1, 9, 1);
        leftArm22.setRotationPoint(8.5F, -5F, 3.3F);
        leftArm22.setTextureSize(128, 64);
        leftArm22.mirror = true;
        setRotation(leftArm22, -0.8028515F, 0F, 0F);
        rightArm1 = new ModelRenderer(this, 0, 28);
        rightArm1.addBox(0F, 0F, 0F, 1, 9, 2);
        rightArm1.setRotationPoint(-7F, -13F, 0F);
        rightArm1.setTextureSize(128, 64);
        rightArm1.mirror = true;
        setRotation(rightArm1, 0.1745329F, 0F, 0.1745329F);
        rightArm21 = new ModelRenderer(this, 7, 28);
        rightArm21.addBox(0F, 0F, 0F, 1, 8, 1);
        rightArm21.setRotationPoint(-8.5F, -5F, 1.5F);
        rightArm21.setTextureSize(128, 64);
        rightArm21.mirror = true;
        setRotation(rightArm21, -0.7504916F, 0F, 0F);
        rightArm22 = new ModelRenderer(this, 12, 28);
        rightArm22.addBox(0F, 0F, 0F, 1, 9, 1);
        rightArm22.setRotationPoint(-8.5F, -5F, 3.3F);
        rightArm22.setTextureSize(128, 64);
        rightArm22.mirror = true;
        setRotation(rightArm22, -0.8028515F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        leftLeg1.render(f5);
        leftLeg11.render(f5);
        leftLeg2.render(f5);
        leftfoot1.render(f5);
        leftfoot2.render(f5);
        rightLeg1.render(f5);
        rightLeg11.render(f5);
        rightLeg2.render(f5);
        rightfoot1.render(f5);
        rightfoot2.render(f5);
        pelvicBone1.render(f5);
        pelvicBone2.render(f5);
        pelvicBone3.render(f5);
        pelvicBone4.render(f5);
        pelvicBone5.render(f5);
        pelvicBone6.render(f5);
        pelvicBone7.render(f5);
        spine1.render(f5);
        spine2.render(f5);
        spine3.render(f5);
        spine4.render(f5);
        spine5.render(f5);
        spine6.render(f5);
        spine7.render(f5);
        spine8.render(f5);
        spine9.render(f5);
        spine10.render(f5);
        spine11.render(f5);
        spine12.render(f5);
        spine13.render(f5);
        spine14.render(f5);
        spine15.render(f5);
        spine16.render(f5);
        spine17.render(f5);
        spine18.render(f5);
        spine19.render(f5);
        spine20.render(f5);
        spine21.render(f5);
        chest.render(f5);
        ribRight1.render(f5);
        ribRight12.render(f5);
        ribRight13.render(f5);
        ribRight2.render(f5);
        ribRight22.render(f5);
        ribRight23.render(f5);
        ribRight3.render(f5);
        ribRight32.render(f5);
        ribRight33.render(f5);
        ribRight4.render(f5);
        ribRight42.render(f5);
        ribRight43.render(f5);
        ribRight5.render(f5);
        ribRight52.render(f5);
        ribRight53.render(f5);
        ribLeft1.render(f5);
        ribLeft12.render(f5);
        ribLeft13.render(f5);
        ribLeft2.render(f5);
        ribLeft22.render(f5);
        ribLeft23.render(f5);
        ribLeft3.render(f5);
        ribLeft32.render(f5);
        ribLeft33.render(f5);
        ribLeft4.render(f5);
        ribLeft42.render(f5);
        ribLeft43.render(f5);
        ribLeft5.render(f5);
        ribLeft52.render(f5);
        ribLeft53.render(f5);
        leftArm1.render(f5);
        leftArm21.render(f5);
        leftArm22.render(f5);
        rightArm1.render(f5);
        rightArm21.render(f5);
        rightArm22.render(f5);

        skull.renderWithTexture(f5, false);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        skullRotation = f4 / (180 / (float) Math.PI);

//        this.skull.rotateAngleX = skullRotation;
        this.skull.rotateAngleY = 0.1745329F;// + skullRotation;
    }

    @Override
    public void setTexturesOffset(String name, int xPos, int zPos) {
        super.setTextureOffset(name, xPos, zPos);
    }

    public float getSkullRotation() {
        return skullRotation;
    }
}
