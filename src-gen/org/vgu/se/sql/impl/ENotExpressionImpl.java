/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.vgu.se.sql.EExpression;
import org.vgu.se.sql.ENotExpression;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENot Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.ENotExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENotExpressionImpl extends MinimalEObjectImpl.Container
    implements ENotExpression {
    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected EExpression expression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ENotExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.ENOT_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(EExpression newExpression,
        NotificationChain msgs) {
        EExpression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.ENOT_EXPRESSION__EXPRESSION,
                oldExpression, newExpression);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExpression(EExpression newExpression) {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject) expression)
                    .eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                            - SqlPackage.ENOT_EXPRESSION__EXPRESSION,
                        null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject) newExpression)
                    .eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                            - SqlPackage.ENOT_EXPRESSION__EXPRESSION,
                        null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ENOT_EXPRESSION__EXPRESSION, newExpression,
                newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SqlPackage.ENOT_EXPRESSION__EXPRESSION:
            return basicSetExpression(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SqlPackage.ENOT_EXPRESSION__EXPRESSION:
            return getExpression();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case SqlPackage.ENOT_EXPRESSION__EXPRESSION:
            setExpression((EExpression) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case SqlPackage.ENOT_EXPRESSION__EXPRESSION:
            setExpression((EExpression) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case SqlPackage.ENOT_EXPRESSION__EXPRESSION:
            return expression != null;
        }
        return super.eIsSet(featureID);
    }

} //ENotExpressionImpl
