// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelchicken extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer beak;
	private final ModelRenderer comb;
	private final ModelRenderer body;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer wing0;
	private final ModelRenderer wing1;
	private final ModelRenderer head;
	private final ModelRenderer beak;
	private final ModelRenderer comb;
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer wing0;
	private final ModelRenderer wing1;

	public Modelchicken() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, -4.0F);

		beak = new ModelRenderer(this);
		beak.setRotationPoint(0.0F, 15.0F, -4.0F);

		comb = new ModelRenderer(this);
		comb.setRotationPoint(0.0F, 15.0F, -4.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, 0.0F);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(2.0F, 19.0F, 1.0F);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.0F, 19.0F, 1.0F);

		wing0 = new ModelRenderer(this);
		wing0.setRotationPoint(3.0F, 13.0F, 0.0F);

		wing1 = new ModelRenderer(this);
		wing1.setRotationPoint(-3.0F, 13.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, -4.0F);
		head.setTextureOffset(14, 13).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(0.0F, -8.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(23, 22).addBox(-1.0F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		beak = new ModelRenderer(this);
		beak.setRotationPoint(0.0F, 15.0F, -4.0F);
		beak.setTextureOffset(24, 4).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		comb = new ModelRenderer(this);
		comb.setRotationPoint(0.0F, 15.0F, -4.0F);
		comb.setTextureOffset(0, 23).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 3).addBox(-2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(18, 0).addBox(-3.0F, -6.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, -6.0F, 1.0F);
		body.addChild(bone);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(2.0F, 19.0F, 1.0F);
		leg0.setTextureOffset(11, 22).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.0F, 19.0F, 1.0F);
		leg1.setTextureOffset(11, 22).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		wing0 = new ModelRenderer(this);
		wing0.setRotationPoint(3.0F, 13.0F, 0.0F);
		wing0.setTextureOffset(0, 13).addBox(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

		wing1 = new ModelRenderer(this);
		wing1.setRotationPoint(-3.0F, 13.0F, 0.0F);
		wing1.setTextureOffset(0, 13).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		beak.render(matrixStack, buffer, packedLight, packedOverlay);
		comb.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		wing0.render(matrixStack, buffer, packedLight, packedOverlay);
		wing1.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		beak.render(matrixStack, buffer, packedLight, packedOverlay);
		comb.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		wing0.render(matrixStack, buffer, packedLight, packedOverlay);
		wing1.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}