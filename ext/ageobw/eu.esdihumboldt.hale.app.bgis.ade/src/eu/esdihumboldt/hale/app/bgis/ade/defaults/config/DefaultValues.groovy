/*
 * Copyright (c) 2013 Fraunhofer IGD
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution. If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Fraunhofer IGD
 */

package eu.esdihumboldt.hale.app.bgis.ade.defaults.config

import eu.esdihumboldt.hale.common.align.model.impl.PropertyEntityDefinition


/**
 * Default value configuration.
 * 
 * @author Simon Templer
 */
class DefaultValues {

	private def attConfigs = [:]

	String getDefaultValue(PropertyEntityDefinition ped) {
		AttributeConfig cfg = attConfigs."${ped.definition.name.localPart}"

		if (cfg) {
			cfg.getDefaultValue(ped)
		}
		else {
			null
		}
	}

	void addEntry(ConfigEntry entry) {
		assert entry.attribute

		AttributeConfig cfg = attConfigs."${entry.attribute}"

		if (!cfg) {
			cfg = new AttributeConfig()
			attConfigs."${entry.attribute}" = cfg
		}

		cfg.addEntry(entry)
	}
}
