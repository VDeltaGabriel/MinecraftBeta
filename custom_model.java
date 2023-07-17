// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer bb_main;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 48, 0.0F, -12.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 16, -4.0F, -12.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 16, -8.0F, -24.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 48, 4.0F, -24.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 16, -4.0F, -24.0F, -2.0F, 8, 12, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}