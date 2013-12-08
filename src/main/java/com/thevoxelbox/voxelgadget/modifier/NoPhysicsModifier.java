package com.thevoxelbox.voxelgadget.modifier;

import com.thevoxelbox.voxelgadget.Processor;

public class NoPhysicsModifier extends AbstractModifier {

    @Override
    public boolean modify(Processor p) {
        p.applyPhysics = false;
        return true;
    }

}