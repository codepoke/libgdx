/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btDynamicsWorldDoubleData extends BulletBase {
	private long swigCPtr;
	
	protected btDynamicsWorldDoubleData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDynamicsWorldDoubleData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btDynamicsWorldDoubleData(long cPtr, boolean cMemoryOwn) {
		this("btDynamicsWorldDoubleData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btDynamicsWorldDoubleData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				DynamicsJNI.delete_btDynamicsWorldDoubleData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setSolverInfo(btContactSolverInfoDoubleData value) {
    DynamicsJNI.btDynamicsWorldDoubleData_solverInfo_set(swigCPtr, this, btContactSolverInfoDoubleData.getCPtr(value), value);
  }

  public btContactSolverInfoDoubleData getSolverInfo() {
    long cPtr = DynamicsJNI.btDynamicsWorldDoubleData_solverInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btContactSolverInfoDoubleData(cPtr, false);
  }

  public void setGravity(btVector3DoubleData value) {
    DynamicsJNI.btDynamicsWorldDoubleData_gravity_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getGravity() {
    long cPtr = DynamicsJNI.btDynamicsWorldDoubleData_gravity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public btDynamicsWorldDoubleData() {
    this(DynamicsJNI.new_btDynamicsWorldDoubleData(), true);
  }

}
