package org.crush.design.action.templatemethod;

/**
 * <p>
 * Title: TODO
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * <p>
 * Copyright: Copyright (c) 2017
 * </p>
 * <p>
 * Company: 客如云
 * </p>
 *
 * @author crush_lee
 * @date 18/4/25
 */
public class StudentATemplate extends AbstractTemplate {
    public StudentATemplate(String name) {
        super(name);
    }

    @Override
    public int answer() {
        return 2;
    }
}
