                switch (ItemRenderer.ItemRenderer$1.field_178094_a[enumaction.ordinal()])
                {
                    case 1:
                        this.transformFirstPersonItem(f, f1);
                        break;

                    case 2:
                    case 3:
                        this.func_178104_a(entityplayersp, partialTicks);
                        break;

                    case 4:
                    	this.transformFirstPersonItem(0.2F, f1);
                    	this.func_178103_d();
                    	GlStateManager.translate(-0.5F, 0.2F, 0.0F);
                        break;

                    case 5:
                        this.transformFirstPersonItem(f, f1);
                        this.func_178098_a(partialTicks, entityplayersp);
                }
