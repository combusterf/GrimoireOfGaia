package gaia.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaJorogumo extends ModelBase {
	ModelRenderer head;
    ModelRenderer headeyes;
	ModelRenderer headaccessory;
	ModelRenderer neck;
	ModelRenderer bodytop;
	ModelRenderer bodymiddlebutton;
	ModelRenderer bodymiddle;
	ModelRenderer bodybottom;
	ModelRenderer rightchest;
	ModelRenderer leftchest;
	public static ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer hair1;
	ModelRenderer hair2;
	ModelRenderer hair3;
	ModelRenderer hairpin1;
	ModelRenderer hairpin2;
	ModelRenderer rightarmupper;
	ModelRenderer leftarmupper;
	ModelRenderer waist;
	ModelRenderer body1;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer leg7;
	ModelRenderer leg5;
	ModelRenderer leg3;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg4;
	ModelRenderer leg6;
	ModelRenderer leg8;

	public ModelGaiaJorogumo() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		
		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-3F, -6F, -3F, 6, 6, 6);
		this.head.setRotationPoint(0F, 5F, -10F);
		this.head.setTextureSize(64, 32);
		this.setRotation(head, 0F, 0F, 0F);
		this.headeyes = new ModelRenderer(this, 24, 0);
		this.headeyes.addBox(-3F, -6F, -3.1F, 6, 6, 0);
		this.headeyes.setRotationPoint(0F, 5F, -10F);
		this.headeyes.setTextureSize(64, 32);
		this.setRotation(headeyes, 0F, 0F, 0F);
		this.headaccessory = new ModelRenderer(this, 36, 0);
		this.headaccessory.addBox(-3.5F, -5.5F, -3.5F, 7, 7, 7);
		this.headaccessory.setRotationPoint(0F, 4F, -10F);
		this.headaccessory.setTextureSize(64, 32);
		this.setRotation(headaccessory, 0F, 0F, 0F);
		this.neck = new ModelRenderer(this, 0, 12);
		this.neck.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.neck.setRotationPoint(0F, 4F, -10F);
		this.neck.setTextureSize(64, 32);
		this.setRotation(neck, 0F, 0F, 0F);
		this.bodytop = new ModelRenderer(this, 0, 16);
		this.bodytop.addBox(-2.5F, 0F, -1.5F, 5, 6, 3);
		this.bodytop.setRotationPoint(0F, 5F, -10F);
		this.bodytop.setTextureSize(64, 32);
		this.setRotation(bodytop, 0.0872665F, 0F, 0F);
		this.bodymiddlebutton = new ModelRenderer(this, 0, 25);
		this.bodymiddlebutton.addBox(-0.5F, 6F, -1.6F, 1, 2, 0);
		this.bodymiddlebutton.setRotationPoint(0F, 5F, -10F);
		this.bodymiddlebutton.setTextureSize(64, 32);
		this.setRotation(bodymiddlebutton, 0.1745329F, 0F, 0F);
		this.bodymiddle = new ModelRenderer(this, 0, 25);
		this.bodymiddle.addBox(-2F, 5.5F, -1.5F, 4, 3, 2);
		this.bodymiddle.setRotationPoint(0F, 5F, -10F);
		this.bodymiddle.setTextureSize(64, 32);
		this.setRotation(bodymiddle, 0.1745329F, 0F, 0F);
		this.bodybottom = new ModelRenderer(this, 0, 30);
		this.bodybottom.addBox(-3F, 8F, -2.5F, 6, 3, 3);
		this.bodybottom.setRotationPoint(0F, 5F, -10F);
		this.bodybottom.setTextureSize(64, 32);
		this.setRotation(bodybottom, 0.2617994F, 0F, 0F);
		this.rightchest = new ModelRenderer(this, 0, 36);
		this.rightchest.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		this.rightchest.setRotationPoint(-1.5F, 7.5F, -11.5F);
		this.rightchest.setTextureSize(64, 32);
		this.setRotation(rightchest, 0.8726646F, 0.3490659F, 0.0872665F);
		this.leftchest = new ModelRenderer(this, 0, 36);
		this.leftchest.mirror = true;
		this.leftchest.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		this.leftchest.setRotationPoint(1.5F, 7.5F, -11.5F);
		this.leftchest.setTextureSize(64, 32);
		this.setRotation(leftchest, 0.8726646F, -0.3490659F, -0.0872665F);
		this.rightarm = new ModelRenderer(this, 16, 12);
		this.rightarm.addBox(-2F, -1F, -1F, 2, 12, 2);
		this.rightarm.setRotationPoint(-2.5F, 6.5F, -9.5F);
		this.rightarm.setTextureSize(64, 32);
		this.setRotation(rightarm, 0F, 0F, 0.0872665F);
		this.leftarm = new ModelRenderer(this, 16, 12);
		this.leftarm.addBox(0F, -1F, -1F, 2, 12, 2);
		this.leftarm.setRotationPoint(2.5F, 6.5F, -9.5F);
		this.leftarm.setTextureSize(64, 32);
		this.setRotation(leftarm, 0F, 0F, -0.0872665F);
		this.hair1 = new ModelRenderer(this, 36, 14);
		this.hair1.addBox(-2F, -9F, -4.5F, 4, 4, 4);
		this.hair1.setRotationPoint(0F, 6F, -10F);
		this.hair1.setTextureSize(64, 32);
		this.setRotation(hair1, -0.0872665F, 0F, 0F);
		this.hair2 = new ModelRenderer(this, 36, 14);
		this.hair2.addBox(-2F, -7F, 0.5F, 4, 4, 4);
		this.hair2.setRotationPoint(0F, 4F, -10F);
		this.hair2.setTextureSize(64, 32);
		this.setRotation(hair2, 0.0872665F, 0F, 0F);
		this.hair3 = new ModelRenderer(this, 36, 45);
		this.hair3.addBox(-4.5F, -5.5F, -1.5F, 9, 5, 5);
		this.hair3.setRotationPoint(0F, 4F, -10F);
		this.hair3.setTextureSize(64, 32);
		this.setRotation(hair3, -0.2617994F, 0F, 0F);
		this.hairpin1 = new ModelRenderer(this, 36, 22);
		this.hairpin1.addBox(-3F, -8F, 0.5F, 6, 4, 1);
		this.hairpin1.setRotationPoint(0F, 4F, -11F);
		this.hairpin1.setTextureSize(64, 32);
		this.setRotation(hairpin1, 0F, 0F, 0F);
		this.hairpin2 = new ModelRenderer(this, 36, 27);
		this.hairpin2.addBox(-4F, -7F, -4F, 8, 4, 1);
		this.hairpin2.setRotationPoint(0F, 4F, -11F);
		this.hairpin2.setTextureSize(64, 32);
		this.setRotation(hairpin2, 0F, 0F, 0F);
		this.rightarmupper = new ModelRenderer(this, 36, 32);
		this.rightarmupper.addBox(-2.5F, 0.5F, -1.5F, 3, 10, 3);
		this.rightarmupper.setRotationPoint(-2.5F, 6.5F, -9.5F);
		this.rightarmupper.setTextureSize(64, 32);
		this.setRotation(rightarmupper, 0F, 0F, 0.0872665F);
		this.leftarmupper = new ModelRenderer(this, 48, 32);
		this.leftarmupper.addBox(-0.5F, 0.5F, -1.5F, 3, 10, 3);
		this.leftarmupper.setRotationPoint(2.5F, 6.5F, -9.5F);
		this.leftarmupper.setTextureSize(64, 32);
		this.setRotation(leftarmupper, 0F, 0F, -0.0872665F);
		this.waist = new ModelRenderer(this, 64, 0);
		this.waist.addBox(-3.5F, -1F, -9F, 7, 7, 4);
		this.waist.setRotationPoint(0F, 16F, -1F);
		this.waist.setTextureSize(64, 32);
		this.setRotation(waist, 0F, 0F, 0F);
		this.body1 = new ModelRenderer(this, 64, 11);
		this.body1.addBox(-3F, -4F, -8F, 6, 8, 8);
		this.body1.setRotationPoint(0F, 16F, -1F);
		this.body1.setTextureSize(64, 32);
		this.setRotation(body1, -0.4363323F, 0F, 0F);
		this.body2 = new ModelRenderer(this, 92, 11);
		this.body2.addBox(-3.5F, -3.5F, -6F, 7, 6, 8);
		this.body2.setRotationPoint(0F, 16F, 2F);
		this.body2.setTextureSize(64, 32);
		this.setRotation(body2, 0.2617994F, 0F, 0F);
		this.body3 = new ModelRenderer(this, 64, 27);
		this.body3.addBox(-2.5F, -6F, -2F, 5, 8, 8);
		this.body3.setRotationPoint(0F, 16F, -1F);
		this.body3.setTextureSize(64, 32);
		this.setRotation(body3, 0.2617994F, 0F, 0F);
		this.body4 = new ModelRenderer(this, 78, 31);
		this.body4.addBox(-5F, -4F, -6F, 10, 10, 12);
		this.body4.setRotationPoint(0F, 13F, 7F);
		this.body4.setTextureSize(64, 32);
		this.setRotation(body4, -0.4363323F, 0F, 0F);
		this.leg7 = new ModelRenderer(this, 92, 0);
		this.leg7.addBox(-15F, -1F, -1F, 16, 2, 2);
		this.leg7.setRotationPoint(-4F, 15F, -1F);
		this.leg7.setTextureSize(64, 32);
		this.setRotation(leg7, 0F, -0.5759587F, -0.5585054F);
		this.leg5 = new ModelRenderer(this, 92, 0);
		this.leg5.addBox(-15F, -1F, -1F, 16, 2, 2);
		this.leg5.setRotationPoint(-4F, 15F, 0F);
		this.leg5.setTextureSize(64, 32);
		this.setRotation(leg5, 0F, -0.2792527F, -0.5585054F);
		this.leg3 = new ModelRenderer(this, 92, 0);
		this.leg3.addBox(-15F, -1F, -1F, 16, 2, 2);
		this.leg3.setRotationPoint(-4F, 15F, 1F);
		this.leg3.setTextureSize(64, 32);
		this.setRotation(leg3, 0F, 0.2792527F, -0.5585054F);
		this.leg1 = new ModelRenderer(this, 92, 0);
		this.leg1.addBox(-15F, -1F, -1F, 16, 2, 2);
		this.leg1.setRotationPoint(-4F, 15F, 2F);
		this.leg1.setTextureSize(64, 32);
		this.setRotation(leg1, 0F, 0.5759587F, -0.4886922F);
		this.leg2 = new ModelRenderer(this, 92, 0);
		this.leg2.addBox(-1F, -1F, -1F, 16, 2, 2);
		this.leg2.setRotationPoint(4F, 15F, 2F);
		this.leg2.setTextureSize(64, 32);
		this.setRotation(leg2, 0F, -0.5759587F, 0.4886922F);
		this.leg4 = new ModelRenderer(this, 92, 0);
		this.leg4.addBox(-1F, -1F, -1F, 16, 2, 2);
		this.leg4.setRotationPoint(4F, 15F, 1F);
		this.leg4.setTextureSize(64, 32);
		this.setRotation(leg4, 0F, -0.2792527F, 0.5585054F);
		this.leg6 = new ModelRenderer(this, 92, 0);
		this.leg6.addBox(-1F, -1F, -1F, 16, 2, 2);
		this.leg6.setRotationPoint(4F, 15F, 0F);
		this.leg6.setTextureSize(64, 32);
		this.setRotation(leg6, 0F, 0.2792527F, 0.5585054F);
		this.leg8 = new ModelRenderer(this, 92, 0);
		this.leg8.addBox(-1F, -1F, -1F, 16, 2, 2);
		this.leg8.setRotationPoint(4F, 15F, -1F);
		this.leg8.setTextureSize(64, 32);
		this.setRotation(leg8, 0F, 0.5759587F, 0.5585054F);
		
		this.convertToChild(head, hair1);
		this.convertToChild(head, hair2);
		this.convertToChild(head, hair3);
		this.convertToChild(head, hairpin1);
		this.convertToChild(head, hairpin2);
		this.convertToChild(rightarm, rightarmupper);
		this.convertToChild(leftarm, leftarmupper);
	}

	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(entity, par2, par3, par4, par5, par6, par7);
		this.setRotationAngles(par2, par3, par4, par5, par6, par7);
		this.head.render(par7);
		this.headaccessory.render(par7);
		this.neck.render(par7);
		this.bodytop.render(par7);
		this.bodymiddlebutton.render(par7);
		this.bodymiddle.render(par7);
		this.bodybottom.render(par7);
		this.rightchest.render(par7);
		this.leftchest.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
//		this.hair1.render(par7);
//		this.hair2.render(par7);
//		this.hair3.render(par7);
//		this.hairpin1.render(par7);
//		this.hairpin2.render(par7);
//		this.rightarmupper.render(par7);
//		this.leftarmupper.render(par7);
		this.waist.render(par7);
		this.body1.render(par7);
		this.body2.render(par7);
		this.body3.render(par7);
		this.body4.render(par7);
		this.leg7.render(par7);
		this.leg5.render(par7);
		this.leg3.render(par7);
		this.leg1.render(par7);
		this.leg2.render(par7);
		this.leg4.render(par7);
		this.leg6.render(par7);
		this.leg8.render(par7);

		if (entity.ticksExisted % 60 == 0 && par3 <= 0.1F) {
			this.headeyes.render(par7);
		} 
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
		//head
		this.head.rotateAngleY = par4 / 57.295776F;
		this.head.rotateAngleX = par5 / 57.295776F;
		this.headeyes.rotateAngleY = this.head.rotateAngleY;
		this.headeyes.rotateAngleX = this.head.rotateAngleX;
		this.headaccessory.rotateAngleY = this.head.rotateAngleY;
		this.headaccessory.rotateAngleX = this.head.rotateAngleX;

		//body
		this.rightchest.rotateAngleX = ((MathHelper.cos(par1 * 0.6662F) * 0.8F * par2)) + 0.8726646F;
		this.leftchest.rotateAngleX = this.rightchest.rotateAngleX;
		
		//legs
		float f6 = 0.7853982F;
		this.leg1.rotateAngleZ = -f6;
		this.leg2.rotateAngleZ = f6;
		this.leg3.rotateAngleZ = -f6 * 0.74F;
		this.leg4.rotateAngleZ = f6 * 0.74F;
		this.leg5.rotateAngleZ = -f6 * 0.74F;
		this.leg6.rotateAngleZ = f6 * 0.74F;
		this.leg7.rotateAngleZ = -f6;
		this.leg8.rotateAngleZ = f6;
		float f7 = -0.0F;
		float f8 = 0.3926991F;
		this.leg1.rotateAngleY = f8 * 2.0F + f7;
		this.leg2.rotateAngleY = -f8 * 2.0F - f7;
		this.leg3.rotateAngleY = f8 * 1.0F + f7;
		this.leg4.rotateAngleY = -f8 * 1.0F - f7;
		this.leg5.rotateAngleY = -f8 * 1.0F + f7;
		this.leg6.rotateAngleY = f8 * 1.0F - f7;
		this.leg7.rotateAngleY = -f8 * 2.0F + f7;
		this.leg8.rotateAngleY = f8 * 2.0F - f7;
		float f9 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * par2;
		float f10 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * par2;
		float f11 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * par2;
		float f12 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * par2;
		float f13 = Math.abs(MathHelper.sin(par1 * 0.6662F + 0.0F) * 0.4F) * par2;
		float f14 = Math.abs(MathHelper.sin(par1 * 0.6662F + (float)Math.PI) * 0.4F) * par2;
		float f15 = Math.abs(MathHelper.sin(par1 * 0.6662F + 1.5707964F) * 0.4F) * par2;
		float f16 = Math.abs(MathHelper.sin(par1 * 0.6662F + 4.712389F) * 0.4F) * par2;
		this.leg1.rotateAngleY += f9;
		this.leg2.rotateAngleY += -f9;
		this.leg3.rotateAngleY += f10;
		this.leg4.rotateAngleY += -f10;
		this.leg5.rotateAngleY += f11;
		this.leg6.rotateAngleY += -f11;
		this.leg7.rotateAngleY += f12;
		this.leg8.rotateAngleY += -f12;
		this.leg1.rotateAngleZ += f13;
		this.leg2.rotateAngleZ += -f13;
		this.leg3.rotateAngleZ += f14;
		this.leg4.rotateAngleZ += -f14;
		this.leg5.rotateAngleZ += f15;
		this.leg6.rotateAngleZ += -f15;
		this.leg7.rotateAngleZ += f16;
		this.leg8.rotateAngleZ += -f16;
		
		//arms
		this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2 * 0.5F;
		this.leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2 * 0.5F;
		
		this.rightarm.rotateAngleZ = 0.0F;
		this.leftarm.rotateAngleZ = 0.0F;
		
        float f17;
        float f18;

        if (this.swingProgress > -9990.0F) {
        	f17 = this.swingProgress;
        	f17 = 1.0F - this.swingProgress;
        	f17 *= f17;
        	f17 *= f17;
        	f17 = 1.0F - f17;
        	f18 = MathHelper.sin(f17 * (float)Math.PI);
            float f19 = MathHelper.sin(this.swingProgress * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
            
            this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)f7 * 1.2D + (double)f19));
            this.rightarm.rotateAngleY += (this.bodytop.rotateAngleY * 2.0F);
            this.rightarm.rotateAngleZ = (MathHelper.sin(this.swingProgress * (float)Math.PI) * -0.4F);
        }
        
        this.rightarm.rotateAngleZ += (MathHelper.cos(par3 * 0.09F) * 0.025F + 0.025F) + 0.0872665F;
        this.rightarm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.025F;
        this.leftarm.rotateAngleZ -= (MathHelper.cos(par3 * 0.09F) * 0.025F + 0.025F) + 0.0872665F;
        this.leftarm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.025F;
	}
	
	protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild) {
		parChild.rotationPointX -= parParent.rotationPointX;
		parChild.rotationPointY -= parParent.rotationPointY;
		parChild.rotationPointZ -= parParent.rotationPointZ;
		parChild.rotateAngleX -= parParent.rotateAngleX;
		parChild.rotateAngleY -= parParent.rotateAngleY;
		parChild.rotateAngleZ -= parParent.rotateAngleZ;
		parParent.addChild(parChild);
	}
}
