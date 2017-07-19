/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
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

public class btHingeConstraintFloatData extends BulletBase {
	private long swigCPtr;
	
	protected btHingeConstraintFloatData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btHingeConstraintFloatData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btHingeConstraintFloatData(long cPtr, boolean cMemoryOwn) {
		this("btHingeConstraintFloatData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btHingeConstraintFloatData obj) {
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
				DynamicsJNI.delete_btHingeConstraintFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTypeConstraintData(btTypedConstraintData value) {
    DynamicsJNI.btHingeConstraintFloatData_typeConstraintData_set(swigCPtr, this, btTypedConstraintData.getCPtr(value), value);
  }

  public btTypedConstraintData getTypeConstraintData() {
    long cPtr = DynamicsJNI.btHingeConstraintFloatData_typeConstraintData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTypedConstraintData(cPtr, false);
  }

  public void setRbAFrame(btTransformFloatData value) {
    DynamicsJNI.btHingeConstraintFloatData_rbAFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getRbAFrame() {
    long cPtr = DynamicsJNI.btHingeConstraintFloatData_rbAFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setRbBFrame(btTransformFloatData value) {
    DynamicsJNI.btHingeConstraintFloatData_rbBFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getRbBFrame() {
    long cPtr = DynamicsJNI.btHingeConstraintFloatData_rbBFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setUseReferenceFrameA(int value) {
    DynamicsJNI.btHingeConstraintFloatData_useReferenceFrameA_set(swigCPtr, this, value);
  }

  public int getUseReferenceFrameA() {
    return DynamicsJNI.btHingeConstraintFloatData_useReferenceFrameA_get(swigCPtr, this);
  }

  public void setAngularOnly(int value) {
    DynamicsJNI.btHingeConstraintFloatData_angularOnly_set(swigCPtr, this, value);
  }

  public int getAngularOnly() {
    return DynamicsJNI.btHingeConstraintFloatData_angularOnly_get(swigCPtr, this);
  }

  public void setEnableAngularMotor(int value) {
    DynamicsJNI.btHingeConstraintFloatData_enableAngularMotor_set(swigCPtr, this, value);
  }

  public int getEnableAngularMotor() {
    return DynamicsJNI.btHingeConstraintFloatData_enableAngularMotor_get(swigCPtr, this);
  }

  public void setMotorTargetVelocity(float value) {
    DynamicsJNI.btHingeConstraintFloatData_motorTargetVelocity_set(swigCPtr, this, value);
  }

  public float getMotorTargetVelocity() {
    return DynamicsJNI.btHingeConstraintFloatData_motorTargetVelocity_get(swigCPtr, this);
  }

  public void setMaxMotorImpulse(float value) {
    DynamicsJNI.btHingeConstraintFloatData_maxMotorImpulse_set(swigCPtr, this, value);
  }

  public float getMaxMotorImpulse() {
    return DynamicsJNI.btHingeConstraintFloatData_maxMotorImpulse_get(swigCPtr, this);
  }

  public void setLowerLimit(float value) {
    DynamicsJNI.btHingeConstraintFloatData_lowerLimit_set(swigCPtr, this, value);
  }

  public float getLowerLimit() {
    return DynamicsJNI.btHingeConstraintFloatData_lowerLimit_get(swigCPtr, this);
  }

  public void setUpperLimit(float value) {
    DynamicsJNI.btHingeConstraintFloatData_upperLimit_set(swigCPtr, this, value);
  }

  public float getUpperLimit() {
    return DynamicsJNI.btHingeConstraintFloatData_upperLimit_get(swigCPtr, this);
  }

  public void setLimitSoftness(float value) {
    DynamicsJNI.btHingeConstraintFloatData_limitSoftness_set(swigCPtr, this, value);
  }

  public float getLimitSoftness() {
    return DynamicsJNI.btHingeConstraintFloatData_limitSoftness_get(swigCPtr, this);
  }

  public void setBiasFactor(float value) {
    DynamicsJNI.btHingeConstraintFloatData_biasFactor_set(swigCPtr, this, value);
  }

  public float getBiasFactor() {
    return DynamicsJNI.btHingeConstraintFloatData_biasFactor_get(swigCPtr, this);
  }

  public void setRelaxationFactor(float value) {
    DynamicsJNI.btHingeConstraintFloatData_relaxationFactor_set(swigCPtr, this, value);
  }

  public float getRelaxationFactor() {
    return DynamicsJNI.btHingeConstraintFloatData_relaxationFactor_get(swigCPtr, this);
  }

  public btHingeConstraintFloatData() {
    this(DynamicsJNI.new_btHingeConstraintFloatData(), true);
  }

}
